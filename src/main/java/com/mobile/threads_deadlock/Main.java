package com.mobile.threads_deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    static Lock lockTrue = new ReentrantLock();
    static Lock lockFalse = new ReentrantLock();

    static Object lock = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {

        MyThreadSync myThreadTrue = new MyThreadSync(true);
        MyThreadSync myThreadFalse = new MyThreadSync(false);

        myThreadTrue.start();
        myThreadFalse.start();

    }
}
