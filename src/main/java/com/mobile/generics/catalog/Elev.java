package com.mobile.generics.catalog;

public class Elev {

    private String name;
    private int clasa;

    public Elev(String name, int clasa) {
        this.name = name;
        this.clasa = clasa;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "name='" + name + '\'' +
                ", clasa=" + clasa +
                '}';
    }
}
