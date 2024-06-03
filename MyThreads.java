package com.example.training2;

public class MyThreads extends Thread{
    private int threadNumber;
    public MyThreads(int threadNumber){
        this.threadNumber=threadNumber;

    }

    @Override
    public void run() {

        for (int i=5; i>0; i--) {
            System.out.println(i + " Thread from thread number " + threadNumber);
            }
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End");


    }



