package com.example.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server1 {
        public static void main(String[] args) throws Exception { //Socket Connection
            ServerSocket serverSocket = new ServerSocket(6969);
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String echoString;
            while (true) {
                echoString = input.readLine();
                System.out.println(echoString);
                if (echoString.equals("Exit")) {
                    break;
                }
                output.println("Echo from the server " + echoString);
            }

//            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
//            pw.println("PrintWriter");
//             if (input != null) {
//             PrintStream ps = new PrintStream(socket.getOutputStream());
//             ps.println("Message received");
//             while (true) {
//                 String echoString = input.readLine();
//                 if (echoString.equals("Exit")) {
//                     break;

            output.println("Echo from server: " + echoString);
        }
    }


//            InputStreamReader is = new InputStreamReader(s.getInputStream());
//            BufferedReader bf = new BufferedReader(is); //buffered reader for input
//            String str = bf.readLine();
//            System.out.println("Client: " +str);
//
//            PrintWriter pr = new PrintWriter(s.getOutputStream()); //PrintWriter for output
//            pr.println("yes");
//            pr.flush(); //Two way comm

        }
}
