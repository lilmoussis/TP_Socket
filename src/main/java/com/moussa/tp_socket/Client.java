package com.moussa.tp_socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable {

    private String ip_server;
    private int port_server;

    public Client(String ip_server, int port_server) {
        this.ip_server = ip_server;
        this.port_server = port_server;
    }

    @Override
    public void run() {
        try{
            Socket socket2 = new Socket("localhost", 4444);
            PrintWriter writer = new PrintWriter(socket2.getOutputStream( ));
            System.out.println("client connecter");
            while(true){
                socket2 = new Socket("localhost", 4444);
                writer.flush ();
                socket2.close();
            }

        }catch(Exception e){

        }
    }
}
