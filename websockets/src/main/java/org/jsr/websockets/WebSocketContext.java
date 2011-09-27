package org.jsr.websockets;

public interface WebSocketContext extends WebSocketListener {
   void send(String data, boolean last);

   void send(byte[] data, boolean last);

   void close();

   void close(int code, String reason);

   boolean isConnected();

   boolean add(WebSocketListener listener);

   boolean remove(WebSocketListener listener);
}