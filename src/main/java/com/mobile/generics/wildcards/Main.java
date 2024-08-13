package com.mobile.generics.wildcards;

public class Main {

    public static void main(String[] args) {
        Theatre<Student> theatreStudents = new Theatre<>();
        theatreStudents.enter(new Student());

//        Theatre<Animal> theatreAnimals = new Theatre<>();

        Theatre<StudentEminent> theatreStudentsEminent = new Theatre<>();

    }
}
