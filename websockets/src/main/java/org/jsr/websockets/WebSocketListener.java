package org.jsr.websockets;

public interface WebSocketListener {
    void onConnect();

    void onMessage(String text, boolean last);

    void onMessage(byte[] data, boolean last);

    void onClose(int code, String reason);
}
