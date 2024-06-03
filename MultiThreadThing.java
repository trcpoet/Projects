package com.example.finalexam;

public class MultiThreadThing extends Thread {

    private int threadNumber;
    public MultiThreadThing (int threadNumber) {
        this.threadNumber = threadNumber; // Another way to make threads and assign numbers to each thread
    }
    @Override
    public void run (){
        for (int i = 0; i<=5; i++){
            System.out.println(i + " from thread: " + threadNumber);
            if (threadNumber ==3){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }

    }
}
