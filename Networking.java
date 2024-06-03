package com.example.networking;

public class Networking {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " running ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(threadName + " Finished");


        };

    for (int i=0;i<5;i++){
    Thread thread = new Thread(runnable, "Thread 1");
    thread.start();

    Thread thread2 = new Thread(runnable, "Thread 2");
    thread2.start();

    }


}}
