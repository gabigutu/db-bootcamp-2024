package com.mobile.generics.wildcards2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();

        pets.add(new Pet("Pisi"));
        pets.add(new Pet("Azorel"));

        animals.add(new Animal("lion"));
        animals.add(new Animal("elephant"));

        Veterinar veterinar = new Veterinar();
        veterinar.animalsList(pets);
        veterinar.animalsList(animals);

        List<Object> objects = new ArrayList<>();

        objects.add(new Object());
        veterinar.animalsList(objects);
    }
}
