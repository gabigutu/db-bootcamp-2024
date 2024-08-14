package com.mobile.threadshello;

public class Angajat implements Runnable {

    private String name;

    public Angajat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Employee " + name + " arrived at work");
    }
}
