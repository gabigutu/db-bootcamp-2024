package com.mobile.compare;

public class Student implements Comparable<Student> {

    String name;
    int genre; /*
       5 - m
       6 - f
    */

    public Student(String name, int genre) {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public int compareTo(Student other) {
        // compare studentul this cu student other
        if (this.genre < other.genre) {
            return -1;
        } else {
            if (this.genre > other.genre) {
                return 1;
            }
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }
}
