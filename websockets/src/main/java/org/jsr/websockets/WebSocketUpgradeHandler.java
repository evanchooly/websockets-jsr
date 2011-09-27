package org.jsr.websockets;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.jsr.servlet.HttpUpgradeHandler;
import org.jsr.servlet.UpgradeException;
import org.jsr.servlet.UpgradeHandler;

@HttpUpgradeHandler (protocol ="websocket", urlPatterns={"/sample"})
public class WebSocketUpgradeHandler implements UpgradeHandler {
    @Override
    public final void doUpgrade(ServletRequest request, ServletResponse response) throws UpgradeException {
       // websocket handshake logic done here
    }

    public void customizeHandshake(ServletRequest request, ServletResponse response) {
    }

    public WebSocketContext createContext(ServletRequest request, ServletResponse response) {
        return new DefaultWebSocketContext(request, response);
    }
}