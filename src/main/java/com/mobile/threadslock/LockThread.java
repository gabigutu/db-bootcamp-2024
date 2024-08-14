package com.mobile.threadslock;

import java.util.concurrent.locks.Lock;

public class LockThread extends Thread {

    Lock lock;

    public LockThread(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.println("Hello from thread " + getName());
        System.out.println("Goodbye from thread " + getName());
        lock.unlock();
    }
}
