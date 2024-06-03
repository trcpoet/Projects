package com.example.echoclient;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class client  {
    public static void main(String[] args) throws Exception {

    try(Socket socket = new Socket("TRC", 420)){
        BufferedReader echoes = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

        Scanner scanner = new Scanner(System.in); //String to be echoed
        String echoString;
        String response;
        do {
            System.out.println("Enter String to be echoed ");
            echoString = scanner.nextLine();
            stringToEcho.println(echoString);
            if (!echoString.equals("Exit")) {
                response = echoes.readLine();
                System.out.println(response);
            }
        }while(!echoString.equals("Exit"));

    }

}}
