package com.mobile.college;

public class StaticProperty {

    public static void main(String[] args) {
        Student[] myStudents = new Student[2];
        myStudents[0] = new Student(222, "Aryan");
        myStudents[1] = new Student(111, "Karan");

        System.out.println(myStudents[0].id + ": " + myStudents[0].name + " (" + myStudents[0].college + ")" + " individualPhone = " + myStudents[0].facultyPhone + " individualObject = " + myStudents[0].individualPhone);
        System.out.println(myStudents[1].id + ": " + myStudents[1].name + " (" + myStudents[1].college + ")" + " individualPhone = " + myStudents[1].facultyPhone + " individualObject = " + myStudents[1].individualPhone);

        System.out.println("Faculty phone: " + myStudents[0].facultyPhone);
        System.out.println("Faculty phone: " + myStudents[1].facultyPhone);
        System.out.println("Faculty phone: " + Student.facultyPhone);

        System.out.println("Individual phone (0): " + myStudents[0].individualPhone);
        System.out.println("Individual phone (1): " + myStudents[1].individualPhone);
//        System.out.println("Individual phone (?): " + Student.individualPhone); // cannot do this

        myStudents[0].sayHello();
        myStudents[1].sayHello();
//        Student.sayHello();

        Student.printFacultyPhone();
        myStudents[0].printFacultyPhone(); // ?

    }
}

class Phone {

}