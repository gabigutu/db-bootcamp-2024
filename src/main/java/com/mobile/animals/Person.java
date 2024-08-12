package com.mobile.animals;

public class Person implements IWalk, ISing, IDance {
    @Override
    public void walk() {
        this.walk(5);
    }

    public void walk(int speed) {
        System.out.println("Person walking (" + speed + " km/h)");
    }

    @Override
    public void sing() {
        System.out.println("Person singing");
    }

    @Override
    public void dance() {
        System.out.println("Person dancing");
    }
}
