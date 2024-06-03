package com.example.training2;

public class MyRunnable implements Runnable{

    private int threadNumber;
    public void MyThreads(int threadNumber){
        this.threadNumber=threadNumber;

    }

    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println(i + " Thread from thread number " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 1 is finished");
    }
}
