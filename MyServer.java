package com.example.networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServer {
    public static void main(String[] args) throws IOException {
        Socket soc;
        ServerSocket sos = new ServerSocket(6666);
        try {
            soc = sos.accept();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ObjectInputStream ois = new ObjectInputStream(soc.getInputStream());
        String str = (String) ois.readUTF();
        System.out.println("Message : " + str);

        sos.close();
    }

    }

