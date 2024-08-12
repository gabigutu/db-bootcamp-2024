package com.mobile.cloneable;

public class Car implements Cloneable {

    String make;
    String model;
    String nrInmatriculare;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone(); // new reference
        car.make += " (COPY)";
        return car;
    }
}
