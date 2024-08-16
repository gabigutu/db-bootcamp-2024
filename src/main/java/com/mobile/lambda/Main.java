package com.mobile.lambda;

public class Main {

    public static void main(String[] args) {

        //Animal animal1 = () -> "Animal sound ";
        Animal animal1 = () -> { return "Animal sound "; };
        System.out.println(animal1.makeSound());

        Animal animal2 = () -> {
            System.out.println("Another body");
            return "Animal2 sound ";
        };
        System.out.println(animal2.makeSound());

        Sound sound1 = (sound, vol) -> "I header a sound: " + sound + " (volume = " + vol + ")";
        System.out.println(sound1.makeSound("scream", 1000));
        System.out.println(sound1.makeSound("whisper", 100));

        Sound sound2 = (sound, vol) -> {
            System.out.println("Something else to do");
            // ...
            return "I header a sound2: " + sound + " (volume = " + vol + ")";
        };
        System.out.println(sound2.makeSound("scream", 1000));

        MyVoid myVoid1 = () -> {
            System.out.println("Something to be done");
        };
        myVoid1.someMethod();


    }
}
