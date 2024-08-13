package com.mobile.generics.method;
// generic type defined in method

import com.mobile.studentexception.Student;

public class Main {

    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 7;
        Object rez = Calculator.<Integer>add(5, 7);
        System.out.println("Rez: " + rez);

        Student s1 = new Student("Vasilica", 23, 3, true);
        Student s2 = new Student("George", 21, 1, true);
        Object s3 = Calculator.<Student>add(s1, s2);
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
    }


}
