package com.mobile.generics.wildcards2;

import java.util.List;

public class Veterinar {

    void animalsList(List<? super Pet> animals) {
        System.out.println("Animals List: " + animals.size());
        for (Object animal : animals) {
            System.out.println("Animal: " + animal);
        }
    }

}
