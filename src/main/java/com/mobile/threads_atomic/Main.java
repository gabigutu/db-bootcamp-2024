package com.mobile.threads_atomic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<AtomicThread> atomicThreadList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            AtomicThread atomicThread = new AtomicThread();
            atomicThread.start();
            atomicThreadList.add(atomicThread);
        }

        for (AtomicThread atomicThread : atomicThreadList) {
            atomicThread.join();
        }

        System.out.println("Nr = " + AtomicThread.nr);
    }

}
