package com.mobile.generics.wildcards2;

public class Pet extends Animal {

    String name;

    public Pet(String name) {
        super("pet");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
