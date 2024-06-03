package com.example.echoserver6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer6 {
    public static void main(String[] args) {
        try (ServerSocket = serverSocket = new ServerSocket(5000){
            while (true) {
                Socket socket = serverSocket.accept();
                BufferedReader input = new BufferedReader( new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true)
                String echoString = input.readLine();
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e){
                    System.out.println("Exception happened");
                }
                if(echoString.equals("exit")){
                    break;
                }

            }
        }

    }
}
