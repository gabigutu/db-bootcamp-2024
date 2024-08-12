package com.mobile.inheritance;

public class Person {
    protected String name;
    int age;

    Person(String name, int age) {
//        super();
        this.name = name;
        this.age = age;
        System.out.println("Person constructor");

    }

    void saySomething(String message) {
        System.out.println(name + ": " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
