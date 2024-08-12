package com.mobile.exceptions;

public class Main {

    public static void main(String[] args) {
        System.out.println(Calculator.divide(4, 2));
        System.out.println(Calculator.divide(2, 4));

//        try {
//            System.out.println(Calculator.divide(2, 0));
//        } catch (ArithmeticException e) {
//            System.out.println("Am primit o exceptie aritmetica: " + e.getMessage());
//        }

        try {
            problematicDivision();
        } catch (Exception e) {
            System.out.println("(problematicDivision) Am primit o exceptie aritmetica: " + e.getMessage());
        }

    }

    // unchecked
    static void problematicDivision() throws ArithmeticException {
        System.out.println(Calculator.divide(2, 0));

        System.out.println("Am trecut");
    }
}

class Calculator {
    static float divide(float a, float b) {
        return a / b; // TODO: with divide gives infinity
    }

    static int divide(int a, int b) {
        return a / b;
    }
}