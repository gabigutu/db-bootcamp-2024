package com.mobile.design_patterns.factory;

public abstract class ConcreteProduct implements Product {

    protected String name;
    protected float price;

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
