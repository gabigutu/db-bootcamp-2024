package com.mobile.threads_deadlock;

public class MyThread extends Thread {

    boolean whichOne;

    MyThread(boolean whichOne) {
        this.whichOne = whichOne;
    }

    @Override
    public void run() {
        if (whichOne) {
            Main.lockTrue.lock();
                System.out.println("Message 1");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Main.lockFalse.lock();
                    System.out.println("Message 1.1");
                Main.lockFalse.unlock();
            Main.lockTrue.unlock();
        } else {
            Main.lockFalse.lock();
                System.out.println("Message 2");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Main.lockTrue.lock();
                    System.out.println("Message 2.1");
                Main.lockTrue.unlock();
            Main.lockFalse.unlock();
        }
    }
}
