package com.mobile.threads_deadlock;

public class MyThreadSync extends Thread {

    boolean whichOne;

    MyThreadSync(boolean whichOne) {
        this.whichOne = whichOne;
    }

    @Override
    public void run() {
        /*
            Message 1
            Message 2
         */

        /*
        T1 holds Lock1 and is waiting for Lock2.
	•	T2 holds Lock2 and is waiting for Lock1.
         */
        if (whichOne) {
            synchronized (Main.lock) {
                System.out.println("Message 1");
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (Main.lock2) {
                    System.out.println("Message 1.1");
                }
            }
        } else {
            // T2...
            synchronized (Main.lock2) {
                System.out.println("Message 2");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (Main.lock) {
                    System.out.println("Message 2.1");
                }
            }
        }
        // T2 ...
        // T1

    }
}
