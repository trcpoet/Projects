package com.example.chattingapplication;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Server extends JFrame {
    Server(){
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        add(p1);

        // Correct path to the image resource
        URL imageUrl = ClassLoader.getSystemResource("com/icons/icon.png");
        ImageIcon i1 = null;
        if (imageUrl != null) {
            i1 = new ImageIcon(imageUrl);
        } else {
            System.err.println("Resource not found: icons/icon.png");
            // You can set i1 to a default image or handle the error as appropriate
        }

        if (i1 != null) {
            JLabel back = new JLabel(i1);
            back.setBounds(5, 20, 25, 25);
            p1.add(back);
        }

        setSize(450, 700);
        setLocation(200, 50);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Server();
    }
}
