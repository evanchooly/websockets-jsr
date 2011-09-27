package org.jsr.websockets;

public interface WebSocket {
    void send(String data, boolean last);

    void send(byte[] data, boolean last);

    void close();

    void close(int code, String reason);

    boolean isConnected();

    boolean add(WebSocketListener listener);

    boolean remove(WebSocketListener listener);

    void onConnect();

    void onMessage(String text, boolean last);

    void onMessage(byte[] data, boolean last);

    void onClose(int code, String reason);
}