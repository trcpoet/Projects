package com.example.echoserver6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoText extends Thread {
    private Socket socket;

    public EchoText(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        super.run();
        try {
            BufferedReader input = new BufferedReader( new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            String echoString = input.readLine();

            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("Client is connected");
                EchoText echoText = new EchoText(socket);
                echoText.start();
            }

        } catch (IOException e){
            System.out.println("Exception happened: "
            +e.getMessage());
        }
    }

}
