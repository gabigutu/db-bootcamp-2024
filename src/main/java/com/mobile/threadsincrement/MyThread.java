package com.mobile.threadsincrement;

public class MyThread extends Thread {

    static Object myThreadObject = new Object();
    private Calcul calcul;

    MyThread(Calcul calcul) {
        this.calcul = calcul;
    }

    @Override
    public void run() {
//        synchronized (Main.myObject) /* T321, T286, T798, T801, T399 (busy waiting) */ {
//            //  T876
//            Main.val = Main.val + 1; // nu este o operatie atomica (3 operatii)
//            // ...
//            // ...
//        }

//        synchronized (Main.myObject2) /* T965, T201, ... */  {
//            //  T221,
//            Main.val = Main.val + 1; // nu este o operatie atomica (3 operatii)
//        }

        //  T777 iese

        /*
            Main.val = 700

            T965_1. READ Main.val (REG) (READ 700)
            T965_2. REG + 1  (700 + 1)
            T321_1. READ Main.val (REG) (READ 700)
            T965_3. Save to Main.val (ce primesc de la pasul 2) (MEM) ; Main.val = 701;
            T321_2. REG + 1 (700 + 1)
            T321_3. Save to Main.val (ce primesc de la pasul 2) (MEM) ; Main.val = 701;
            Race condition
         */

        /*increment();
        decrement();*/

        calcul.increment();

    }

    public static synchronized void increment() {
        Main.val = Main.val + 1; // nu este o operatie atomica (3 operatii)
    }

    public static synchronized void decrement() {
        Main.val = Main.val - 1;
    }

    /*
    T965_1. READ Main.val (REG) (READ 700)
    T965_2. REG + 1  (700 + 1)
    T321_1. READ Main.val (REG) (READ 700)
    T965_3. Save to Main.val (ce primesc de la pasul 2) (MEM) ; Main.val = 701;
    T321_2. REG + 1 (700 - 1)
    T321_3. Save to Main.val (ce primesc de la pasul 2) (MEM) ; Main.val = 699;
    Race condition
    */




}
