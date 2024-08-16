package com.mobile.anonymous;

public class Main {

    static int x = 0;

    public static void main(String[] args) {
        Pig pig = new Pig();
        System.out.println(pig.cry("pig"));

        Animal pig2 = new Pig();
        System.out.println(pig2.cry("pig"));

        Animal pig3 = new Animal() {
            @Override
            public String cry(String animal) {
                return "pig3 crying " + animal;
            }
        }; // clasa anonima care implementeaza interfata
//        Animal pig31 = ?????;

        Animal pig41 = new CopieClasaAnonima();
        Animal pig42 = new CopieClasaAnonima();

        System.out.println(pig3.cry("pig"));


        Animal genericAnimalObj = (animal) -> {
            x = x * 2;
            return animal + " sound "; }; // lambda expression == clasa anonima care implementeaza interfata Animal si defineste corp pentru singura metoda definita pe interfata aia
//        Animal genericAnimalObj2 = ?????;
        System.out.println(genericAnimalObj.cry("pig"));

    }


}
