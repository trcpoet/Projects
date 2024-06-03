package com.example.finalexam;

public class MultiThreading {
    public static void main(String[] args)  {

        for (int i =0;i<5;i++) {
            MultiThreadThing myThing = new MultiThreadThing(i); //Extends Thread
            myThing.start();

            MultiThreadThing2 myThing2 = new MultiThreadThing2(i); //Implements Runnable
            Thread myThread = new Thread(myThing2);
//            Thread myThread2 = new Thread(myThing2);
            myThread.start();
//            myThread2.start();


            try {
                myThing.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }


        }

    }

}
