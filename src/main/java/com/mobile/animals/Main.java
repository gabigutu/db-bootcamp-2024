package com.mobile.animals;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.sing();

        Person person = new Person();
        person.walk();
        person.sing();
        person.dance();
        person.walk(10);

    }

}
