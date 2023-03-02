package com.moussa.tp_socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Handler extends Thread {
    private final Socket socket;
    // constructeur
    public Handler(Socket socket){
        this.socket=socket;
    }

    public void run() {
        try{
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            String line = "";
            while((line = reader.readLine())!= null ){
                System.out.println(line); // gère l'information reçue
            }
            socket.close();
        }catch(Exception e){

        }

    }
}

