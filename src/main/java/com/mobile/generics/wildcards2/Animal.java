package com.mobile.generics.wildcards2;

public class Animal {

    private String type;

    public Animal(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                '}';
    }
}
