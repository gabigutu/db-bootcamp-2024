package com.mobile.collections;

public class Pet implements Comparable<Pet> {

    private String name;
    private int genre;

    public Pet(String name, int genre) {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public int compareTo(Pet o) {
        if (this.genre > o.genre) return 1;
        else if (this.genre < o.genre) return -1;
        else return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }
}
