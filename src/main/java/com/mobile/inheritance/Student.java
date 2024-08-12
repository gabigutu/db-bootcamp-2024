package com.mobile.inheritance;

public class Student extends Person {
    private String faculty;

    Student(String faculty) {
        this(faculty, "Unknown", -1);
    }

    Student(String faculty, String name) {
        this(faculty, name, -1);
    }

    Student(String faculty, String name, int age) {
        super(name, age);
        this.faculty = "FACULTATEA: " + faculty;
        // 10 lines
    }

    void inscriereFacultate(String faculty) {
        this.faculty = faculty;
    }

    private void isScrolling() {
        char is = (char) Math.round(Math.random()); // [0; 1) => 0 / 1
        if (is == 1) {
            System.out.println("Student is scrolling");
        } else {
            System.out.println("Student is not scrolling");
        }
    }

    @Override
    public String toString() {
        this.isScrolling();
        return "Student: " +
                "faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age;
    }

    String getFaculty() {
        // retrieve from database
        return faculty;
    }

    void setFaculty(String faculty) {
        this.faculty = faculty;
        // write into database
    }
}

