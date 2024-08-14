package com.mobile.threadshello;

public class Employee extends Thread {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Employee " + name + " arrived at work");
    }
}
