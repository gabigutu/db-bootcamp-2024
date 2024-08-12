package com.mobile.animals;

public class Bird implements ISing, IWalk {
    @Override
    public void sing() {
        System.out.println("Bird singing");
    }

    @Override
    public void walk() {
        System.out.println("Bird walking");
    }
}
