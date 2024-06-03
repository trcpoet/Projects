package com.example.regex;

public class ourRunnable implements Runnable {
    @Override
    public void run() {
        try{
             thread.join();
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            System.out.println("Interrupted");
    }
}}
