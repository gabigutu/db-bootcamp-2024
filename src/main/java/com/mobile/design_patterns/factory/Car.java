package com.mobile.design_patterns.factory;

public class Car extends ConcreteProduct {
    @Override
    public float getPrice() {
        return 20 * 1000;
    }

    @Override
    public void setPrice(float price) {
        super.setPrice(price);
        System.out.println("Ajustari de taxe");
    }

    @Override
    public float getName() {
        return 0;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        System.out.println("Ajustari de brand");
    }

    void startEngine() {
        System.out.println("Car started engine");
    }
}
