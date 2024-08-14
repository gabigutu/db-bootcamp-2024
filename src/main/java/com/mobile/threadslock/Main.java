package com.mobile.threadslock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        List<LockThread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            LockThread thread = new LockThread(lock);
            thread.start();
            threads.add(thread);
        }

        for (LockThread thread : threads) {
            thread.join();
        }

    }
}
