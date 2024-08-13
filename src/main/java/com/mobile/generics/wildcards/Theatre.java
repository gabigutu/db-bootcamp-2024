package com.mobile.generics.wildcards;

public class Theatre<T extends Person> { // upper bounded

    public void enter(T person) {
        System.out.println("Someone entered the Theatre: " + person);
    }

}
