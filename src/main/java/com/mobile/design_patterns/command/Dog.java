package com.mobile.design_patterns.command;

public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void stay() {
        System.out.println("Dog " + name + " receives Stay command");
    }

    public void stand() {
        System.out.println("Dog " + name + " receives Stand command");
    }

    public void bring() {
        System.out.println("Dog " + name + " receives Bring command");
    }

}
