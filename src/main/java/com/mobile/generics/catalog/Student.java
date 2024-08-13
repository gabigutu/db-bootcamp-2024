package com.mobile.generics.catalog;

public class Student {

    private String name;
    private int an;

    public Student(String name, int an) {
        this.name = name;
        this.an = an;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", an=" + an +
                '}';
    }
}
