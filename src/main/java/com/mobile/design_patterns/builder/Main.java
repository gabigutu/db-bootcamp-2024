package com.mobile.design_patterns.builder;

public class Main {

    public static void main(String[] args) {
        User firstUser =  new User.UserBuilder("Laur","Dumitrache").setPhone(11111).setAddress("adresa").build();

        System.out.println(firstUser);
    }

}
