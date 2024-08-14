package com.mobile.threadsincrement;

public class Calcul {

    public synchronized void increment() {
        Main.val++;
    }
}
