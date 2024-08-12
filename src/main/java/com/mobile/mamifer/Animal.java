package com.mobile.mamifer;

public class Animal extends Mamifer {
    String specie;

    public Animal(String specie, int noLegs) {
        super(noLegs);
        this.specie = specie;
    }

    public Animal(String specie) {
        this(specie, 4);
    }
}
