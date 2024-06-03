package com.example.threadcolour;


import static com.example.threadcolour.ThreadColor.ANSI_RED;

public class OurRunnable implements Runnable{

    @Override
    public void run() {

        System.out.println(ANSI_RED + "Hello from OurRunnable" + "thread");

    }
}
