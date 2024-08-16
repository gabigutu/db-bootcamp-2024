package com.mobile.threads_atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThread extends Thread {

    static AtomicInteger nr = new AtomicInteger(0);

    @Override
    public void run() {

        AtomicThread.nr.addAndGet(1); // race condition

    }
}
