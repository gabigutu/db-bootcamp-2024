package com.mobile.college;

public class Student {
    int id;
    String name;
    Phone individualPhone = new Phone(); // object property (instance property)
    static Phone facultyPhone = new Phone(); // same reference
    static String college = "ITS";

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Constructor call");
        sayHello();
    }

    void sayHello() { // non-static method
        System.out.println("Hello, my name is " + name + " ! The phone of my faculty is: " + facultyPhone);

    }

    static void printFacultyPhone() {
        System.out.println("Faculty phone: " + facultyPhone);
//        System.out.println("Faculty phone: " + facultyPhone + " Students phone: " + individualPhone); // cannot do this
    }


}
