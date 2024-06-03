package com.example.finalexam;

public class RunnableExample { //2nd way to make threads
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}






















//
//
//MyRunnable myRunnable = new MyRunnable();
//Thread myThread = new Thread(myRunnable);
//myThread.start();
//
//MyThread thread = new MyThread()
//
