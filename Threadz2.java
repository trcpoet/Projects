package com.example.finalexam;

public class Threadz2 extends Thread{
    private int threadNumber;
    public Threadz2 (int threadNumber) {
        this.threadNumber = threadNumber; // Another way to make threads and assign numbers to each thread
    }
    @Override
    public void run(){
        for (int i=0;i<3;i++)
        {        System.out.println(i + " Threadz2 EXTENDS hello from thread number "+ threadNumber );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }

}}}
