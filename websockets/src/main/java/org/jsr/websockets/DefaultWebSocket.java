package org.jsr.websockets;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DefaultWebSocket implements WebSocket {
    public DefaultWebSocket(ServletRequest request, ServletResponse response) {
    }

    @Override
    public void send(String data, boolean last) {
    }

    @Override
    public void send(byte[] data, boolean last) {
    }

    @Override
    public void close() {
    }

    @Override
    public void close(int code, String reason) {
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public boolean add(WebSocketListener listener) {
        return false;
    }

    @Override
    public boolean remove(WebSocketListener listener) {
        return false;
    }

    @Override
    public void onConnect() {
    }

    @Override
    public void onMessage(String text, boolean last) {
    }

    @Override
    public void onMessage(byte[] data, boolean last) {
    }

    @Override
    public void onClose(int code, String reason) {
    }
}
