package com.mobile.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String test = "Vasilica"; // retriveString();
        test = null;
        if (test == null) {
            System.out.println("1) Sir-ul este gol!");
        } else {
            System.out.println("1) Sirul primit este: " + test);
        }

        Optional<String> optionalStr = Optional.ofNullable(test);
        if (optionalStr.isPresent()) {
            System.out.println("2) Am primit un sir pe optional");
        } else {
            System.out.println("2) Nu am primit un sir pe optional");
        }


        Student student1 = provideStudent();
//            System.out.println("Studentul este: " + student1.getName());
        if (student1 != null) {
            System.out.println("1) Studentul este: " + student1.getName());
        } else {
            System.out.println("1) Nu am primit niciun student!");
        }


        Optional<Student> optionalStudent = Optional.<Student>ofNullable(student1);
        System.out.println(optionalStudent);

        if (optionalStudent.isPresent()) {
            Student studentExtras = optionalStudent.get();
            System.out.println("2) Am primit un student: " + studentExtras.getName());
            System.out.println(student1 + " <=> " + studentExtras);
        } else {
            System.out.println("2) Nu am primit un student pe optional!");
        }

        System.out.println(" ====================== ");

        Optional<Student> student2 = provideOptionalStudent();
        if (student2.isPresent()) {
            System.out.println("Student2 are student pe el");
        } else {
            System.out.println("Student2 e gol");
        }

    }

    static Student provideStudent() {
        if (Math.random() < 0.5) {
            return new Student("Gigel");
        } else {
            return null;
        }
    }

    static Optional<Student> provideOptionalStudent() {
        if (Math.random() < 0.5) {
            Student student = new Student("Gigel");
            return Optional.of(student);
        } else {
            return Optional.empty();
        }
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
