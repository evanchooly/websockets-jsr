package org.jsr.websockets;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.jsr.servlet.UpgradeException;
import org.jsr.servlet.UpgradeHandler;

public abstract class WebSocketContext implements UpgradeHandler, WebSocketListener {
    @Override
    public final void doUpgrade(ServletRequest request, ServletResponse response) throws UpgradeException {
       // websocket handshake logic done here
    }

    public void customizeHandshake(ServletRequest request, ServletResponse response) {
    }

    public WebSocket createContext(ServletRequest request, ServletResponse response) {
        return new DefaultWebSocket(request, response);
    }

    @Override
    public void onConnect(WebSocket socket) {
    }

    @Override
    public void onMessage(WebSocket socket, String text, boolean last) {
    }

    @Override
    public void onMessage(WebSocket socket, byte[] data, boolean last) {
    }

    @Override
    public void onClose(WebSocket socket, int code, String reason) {
    }
}