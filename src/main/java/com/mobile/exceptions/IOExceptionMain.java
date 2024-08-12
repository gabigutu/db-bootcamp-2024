package com.mobile.exceptions;

import java.io.File;
import java.io.IOException;

public class IOExceptionMain {

    public static void main(String[] args) {
        File myFile = new File("file.txt");
        try {
            myFile.createNewFile(); // checked exception
        } catch (IOException e) {
            System.out.println("Nu am putut crea fisierul. Am primit exceptia: " + e.getMessage());
        }

        try {
            creeazaFisier("altfisier.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // divide(6, 0);
        // RuntimeException si copii, nepotii etc sunt exceptii unchecked (nu sunt obligat sa le tratez/propag mai sus)

        try {
            Masina oltcit = new Masina("Oltcit", 300 * 1000);
            System.out.println(oltcit);
        } catch (ExceptiaMea e) {
            System.out.println("Nu am putut crea masina Oltcit pentru ca: " + e.getMessage());
        }

        try {
            Masina tesla = new Masina("Tesla", 300);
            System.out.println(tesla);
        } catch (ExceptiaMea e) {
            System.out.println("Nu am putut crea masina Tesla pentru ca: " + e.getMessage());
        }


        try {
            divideAndThrowImpartireLaZero(8, 0);
        } catch (ImpartireLaZeroException e) {
            System.out.println("Am primit exceptia mea: " + e.getMessage());
            Throwable t = e.getCause();
            System.out.println("Ce a cauzat asta: " + t.getMessage());
//            t.printStackTrace();
            e.printStackTrace();
        }

        System.out.println("Ceva de dupa");

    }

    static void divideAndThrowImpartireLaZero(int a, int b) throws ImpartireLaZeroException {
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            throw new ImpartireLaZeroException("Vezi ca nu putem sa facem acest calcul cu parametrii pe care mi i-ai dat: " + a + ", " + b, e);
        }
    }

    static void creeazaFisier(String numeFisier) throws IOException {
        chiarCreeazaFisier(numeFisier);
        ///
    }

    static void chiarCreeazaFisier(String numeFisier) throws IOException {
        File myFile = new File(numeFisier);
        myFile.createNewFile(); // checked exception
    }

    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

class Masina {
    String model;
    int km;

    public Masina(String model, int km) throws ExceptiaMea {
        this.model = model;
        if (km > 200 * 1000) {
            throw new ExceptiaMea("Prea multi kilometri");
        }
        this.km = km;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", km=" + km +
                '}';
    }
}
