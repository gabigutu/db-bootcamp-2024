package com.mobile.compare;

import java.util.Arrays;

public class Main {

    static String arrayToString(Object[] objects) {
        String str = ""; // TODO: replace with StringBuilder
        for (Object object : objects) {
            str += object + ", ";
        }
        return str;
        /* Vasilica, Ionel, Ana
        * str = "";
        * str = str + "Vasilica" // "" + "Vasilica" // "Vasilica" => new "Vasilica"
        * str = str " "Ionel"    // "Vasilica" + "Ionel" // "VasilicaIonel" => new "VasilicaIonel"
        * str = str + "Ana"
        * */

        // "Vasilica"
    }

    static String arrayToStringSb(Object[] objects) {
        StringBuilder sb = new StringBuilder();
        for (Object object : objects) {
            sb.append(object);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Student " + i, (Math.random() > 0.5) ? 5 : 6);
        }
        System.out.println("Before sorting: " + arrayToStringSb(students));
        Arrays.sort(students);
        System.out.println("After sorting: " + arrayToStringSb(students));

        int someVals[] = {6, 7, 8}; // alocare implicita de memorie
//        int someVals2[] = new int[3];
//        someVals2[0] = 4; someVals2[1] = 5; ///
//        otherFunc(4, 5, 2); // can't do this
        otherFunc(someVals);

        someFunc(4, 5, 2 );
        someFunc(someVals);

        someFunc2("Ceva mesaj", someVals);
        someFunc2("Ceva mesaj", 9, 7, 6, 1, 4, 6);
        someFunc2("Ceva mesaj");

    }

    static void someFunc(int... vals) {
        System.out.println("Some Func output: ");
        for (int val : vals) {
            System.out.print(val + ", ");
        }
        System.out.println();
    }

    static void someFunc2(String append, int... vals) {
        System.out.println("Some Func2 output " + append + ": ");
        someFunc(vals);
    }

    static void otherFunc(int[] vals) {
    }
}
