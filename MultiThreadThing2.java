package com.example.finalexam;

public class MultiThreadThing2 implements Runnable {


        private int threadNumber;
        public MultiThreadThing2 (int threadNumber) {
            this.threadNumber = threadNumber; // Another way to make threads and assign numbers to each thread


        }

        @Override
        public void run (){
            for (int i = 0; i<=5; i++){
                System.out.println(i + " from thread console two: " + threadNumber);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }

        }
    }


