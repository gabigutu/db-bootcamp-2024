package com.mobile.arrays;

import com.mobile.college.Student;

public class Arrays {
    public static void main(String[] args) {

        double[] myDoubles = new double[10];
//        myDoubles[0] = 17;
//        myDoubles[1] = 3;
        System.out.println("Length arr = " + myDoubles.length); // 10
        System.out.println("myDoubles = " + myDoubles); // referinta din zona memorie unde mi-a gasit spatiu continuu pentru 10 * 8 bytes

        Object dummy = new Object();
        System.out.println("dummy = " + dummy); // referinta din zona memorie unde mi-a gasit spatiu atat cat are nevoie ca sa imi tina un Object

        int[][] A = new int[3][4];
        A[1][0] = 15;
        A[2][1] = 18;
        System.out.println("A = " + A); // referinta
        System.out.println("A[1] = " + A[1]);
        System.out.println("A[2] = " + A[2]);
        System.out.println("A[2][1] = " + A[2][1]);
        for (int i = 0; i < 4; i++) {
//            System.out.println(A[2][i] + ' '); // (0 + 32 ) . 18 + 32  . 0  + 32  + 0 + 32  //  32503232 ??????
            System.out.print(A[2][i] + " "); // ???
        }
        System.out.println();


        Object[] myObjects = new Object[10]; // aloca-mi spatiu unde sa tin referintele pentru 10 obiecte
        myObjects[3] = new Object(); // da-mi un spatiu pentru un obiect
        System.out.println("myObjects = " + myObjects);

        Student student = new Student(555, "Test");
//        student.sayHello(); // sayHello are modificator de acces default => nu o pot apela din alt pachet/subpachet

    }
}
