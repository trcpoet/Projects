package com.example.finalexam;

public class MainThread {
    public static void main(String[] args) {

        for(int i = 0; i<3; i++){

            MainThread thread = new MainThread(); //Running thread in main
            thread.run();

            Threadz2 newThread = new Threadz2(i); //Extends Thread from Threadz2 Extends Thread
            newThread.run();

        Threadz runnable = new Threadz(i); //implements Runnable from Threadz implements Runnable
        Thread myThread = new Thread(runnable);
        myThread.run();
    }


}

    private void run() {
        System.out.println("Hello from the main thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }

}
