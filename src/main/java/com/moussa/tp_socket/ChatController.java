package com.moussa.tp_socket;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatController {
    @FXML
    private TextField ip_server;
    @FXML
    private TextField port_server;
    @FXML
    private TextField inputmessageclient;
    @FXML
    private VBox vbox_server;
    @FXML
    private VBox vbox_client;
    @FXML
    void validerconnexion(){
        Thread thread1 = new Thread(() -> {
            Client client = new Client(ip_server.getText(), Integer.parseInt(port_server.getText()));
            client.run();
        });
        thread1.start();

    }
    @FXML
    void startServer(){
        Thread thread2 = new Thread(() -> {
            Server server = new Server();
            server.run();
        });
        thread2.start();

    }
    @FXML
    void sendmessageClient(){

    }

}
