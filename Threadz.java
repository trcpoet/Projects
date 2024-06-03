package com.example.finalexam;

public class Threadz implements Runnable{

    private int threadNumber;
    public Threadz (int threadNumber){
            this.threadNumber = threadNumber; // Another way to make threads and assign numbers to each thread
        }


    @Override
    public void run() {
            for (int i = 0; i<=3; i++){
                System.out.println(i + " FROM RUNNABLE THREADZ NUMBER: " + threadNumber);

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
        }
//    Thread myThread = new Thread();
//    myThread.start();
//        for(int i = 0; i<3; i++) {
//            Threadz myThread2 = new Threadz(i);
//            Thread myThread3 = new Thread(myThread2);
//            myThread3.start();
        }





}}
