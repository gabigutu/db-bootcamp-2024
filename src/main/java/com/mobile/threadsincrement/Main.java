package com.mobile.threadsincrement;

public class Main {

    static int val = 0;
    static int NO_THREADS = 100000;
    static Object myObject = new Object(); // ref
    static Object myObject2 = new Object(); // ref



    public static void main(String[] args) throws InterruptedException {
        Calcul calcul = new Calcul();

        MyThread[] myThreads = new MyThread[NO_THREADS];
        for (int i = 0; i < NO_THREADS; i++) {
            myThreads[i] = new MyThread(calcul);
            myThreads[i].start();
        }

        for (int i = 0; i < NO_THREADS; i++) {
            myThreads[i].join();
        }

        System.out.println("Val = " + val);

    }
}
