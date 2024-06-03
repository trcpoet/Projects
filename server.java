package com.example.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws Exception { //Socket Connection
        ServerSocket ss = new ServerSocket(6969);
        Socket s = ss.accept();

        System.out.println("Client Connected");

        InputStreamReader is = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(is); //buffered reader for input
        String str = bf.readLine();
        System.out.println("Client: " +str);

        PrintWriter pr = new PrintWriter(s.getOutputStream()); //PrintWriter for output
        pr.println("yes");
        pr.flush(); //Two way comm

    }
}
