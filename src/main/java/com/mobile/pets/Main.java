package com.mobile.pets;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Penguin penguin = new Penguin();
        dog.makeSound();
        penguin.makeSound();

        Pet somePet = new Penguin();
        somePet.makeSound();

    }
}
