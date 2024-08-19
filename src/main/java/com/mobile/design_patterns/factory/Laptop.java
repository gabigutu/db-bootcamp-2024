package com.mobile.design_patterns.factory;

public class Laptop extends ConcreteProduct {
    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public void setPrice(float price) {
        super.setPrice(price);
        System.out.println("Ajustari pret laptop");
    }

    @Override
    public float getName() {
        return 0;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        System.out.println("Ajustari nume laptop");
    }

    void boot() {
        System.out.println("Laptop is booting");
    }
}
