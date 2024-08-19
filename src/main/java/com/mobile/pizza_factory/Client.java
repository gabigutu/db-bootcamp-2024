package com.mobile.pizza_factory;

public class Client {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    void afla(String notificare) {
        System.out.println(name + ": Am primit:" + notificare);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}

