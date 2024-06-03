package com.example.threadcolour;

public class AnotherThread extends Thread{
    public static final String ANSI_RED = "\u001B[30m";
    public static final String ANSI_BLUE = "\u001B[31m";
     public static final String ANSI_GREEN = "\u001B[31m";
    private static String anotherThread;
//    private Thread anotherThread;

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from " + currentThread().getName());

        try{ System.out.println("Another thread joins");
            anotherThread.join(2000);
            Thread.sleep(10000);
            System.out.println(ANSI_BLUE + "Another thread got terminated and join is completed");

        }catch (InterruptedException e){
            System.out.println(ANSI_GREEN+ "Got interrupted while joining");
            return;
        }

        System.out.println("Waking up after 10 seconds of sleep");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("Thread");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println("Hello from anonymous class thread");

            }
        }.start();

        Thread ourRunnableThread = new Thread(new OurRunnable()) {

                @Override
                public void run() {
                System.out.println("Hello from anonymous runnable thread");
            }
            };


        ourRunnableThread.start();
        anotherThread.interrupt();


        System.out.println(ANSI_RED+"Hello again from the main thread");
        }
}

