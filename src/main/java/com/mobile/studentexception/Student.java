package com.mobile.studentexception;

public class Student {
    String name;
    int age;
    int an;
    boolean buget;

    public Student(String name, int age, int an, boolean buget) {
        this.name = name;
        this.age = age;
        this.an = an;
        this.buget = buget;
    }

    void alocaBiletTren() throws NuEstiLaBugetException, NuAiVarstaPotrivitaException {
        if (!this.buget) {
            throw new NuEstiLaBugetException("Treci la buget!");
        }
        if (this.age > 26 || this.age < 18) {
            throw new NuAiVarstaPotrivitaException(this.age);
        }
        System.out.println("(" + name + "): Ia biletul");
    }
}
