package com.moussa.tp_socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{
    @Override
    public void run() {
        try {
            ServerSocket socket = new ServerSocket(4444);
            Socket clientSocket = socket.accept();
            System.out.println("Serveur demarer");
            InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            PrintWriter writer = new PrintWriter(outputStream, true);
            while (true) {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
