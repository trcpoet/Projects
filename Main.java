package com.example.training2;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        for (int i=0; i<3; i++) {
            MyThreads thread1 = new MyThreads(i);
            thread1.start();
            thread1.join();
            MyRunnable runnable1 = new MyRunnable();//implements Runnable in MyRunnable class to create a thread
            Thread thread2 = new Thread(runnable1);
            thread2.start();
        }


//        MyThreads thread1 = new MyThreads();//Extends Thread from MyThread class to create a thread
//
//        MyRunnable runnable1 = new MyRunnable();//implements Runnable in MyRunnable class to create a thread
//        Thread thread2 = new Thread(runnable1);
//
//
//        thread2.start();



        // TODO Auto-generated method stub

    }


}


