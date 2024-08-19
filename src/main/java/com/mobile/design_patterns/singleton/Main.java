package com.mobile.design_patterns.singleton;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        fileManagerSequential();
        fileManagerParallel();
    }

    static void fileManagerParallel() throws InterruptedException {
        ArrayList<MyThread> threads = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            MyThread myThread = new MyThread();
            threads.add(myThread);
            myThread.start();
        }

        for (int i = 0; i < 10000; i++) {
            threads.get(i).join();
        }
    }

    static void fileManagerSequential() throws InterruptedException {
        FileManager fileManager = FileManager.getInstance();
        System.out.println("FileManager: " + fileManager);

        FileManager fileManager2 = FileManager.getInstance();
        System.out.println("FileManager2: " + fileManager2);

//        FileManager fileManager3 = new FileManager();
//        System.out.println("FileManager3: " + fileManager3);
    }

}
