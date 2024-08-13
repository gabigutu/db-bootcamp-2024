package com.mobile.tryresources;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
//        try (PrintWriter writer = new PrintWriter(System.out)) {
//            writer.print("Salutare");
//            writer.close();
//        }
//
//        try {
//            PrintWriter writer = new PrintWriter(System.out);
//            writer.println("Salutare");
//            writer.close();
//        } catch (Exception e) {
//            //
//        }

        // try with resources
        try (
                Catalog catalog = new Catalog("CA", 321);
                PrintWriter writer = new PrintWriter(System.out)
        ) {
            catalog.printStudents();
        } catch (Exception e) {
            System.out.println("Exceptie in catalog: " + e.getMessage());
        }

        System.out.println("ceva");
    }
}
