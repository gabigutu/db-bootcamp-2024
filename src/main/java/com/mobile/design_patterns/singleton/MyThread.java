package com.mobile.design_patterns.singleton;

public class MyThread extends Thread {

    @Override
    public void run() {
        FileManager fileManager = null;
        try {
            fileManager = FileManager.getInstance();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("(" + this.getName() + ") fileManager: " + fileManager);
    }
}
