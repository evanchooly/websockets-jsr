package org.jsr.websockets;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.jsr.servlet.HttpUpgradeHandler;

@HttpUpgradeHandler(protocol ="websocket", urlPatterns={"/sample"})
public class SampleWebSocketContext extends WebSocketContext {
    @Override
    public void customizeHandshake(ServletRequest request, ServletResponse response) {
        super.customizeHandshake(request, response);
        // insert cookies here
    }

    @Override
    public WebSocket createContext(ServletRequest request, ServletResponse response) {
        return new SampleWebSocket(request, response);
    }

    private static class SampleWebSocket extends DefaultWebSocket {
        private String userName;

        public SampleWebSocket(ServletRequest request, ServletResponse response) {
            super(request, response);
            userName = request.getParameter("user");
        }

        public String getUserName() {
            return userName;
        }
    }
}
