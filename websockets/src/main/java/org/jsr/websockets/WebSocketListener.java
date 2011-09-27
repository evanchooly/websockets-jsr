package org.jsr.websockets;

public interface WebSocketListener {
    void onConnect(WebSocket socket);

    void onMessage(WebSocket socket, String text, boolean last);

    void onMessage(WebSocket socket, byte[] data, boolean last);

    void onClose(WebSocket socket, int code, String reason);
}
