package com.mobile.cloneable;

public class Main {

    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "Model3");
        Car dacia = new Car("Dacia", "Duster");

        System.out.println("Tesla: " + tesla);
        System.out.println("Dacia: " + dacia);

        dacia.nrInmatriculare = "B123DAC";
        System.out.println(dacia.nrInmatriculare);
        Car aceeasiDacie = dacia;
        aceeasiDacie.nrInmatriculare = "CT987CAD";
        System.out.println("Aceeasi Dacie: " + aceeasiDacie);
        System.out.println(dacia.nrInmatriculare); // CT987CAD

        try {
            Car altaDacie = (Car) (dacia.clone());
            System.out.println("Dacie Clonata: " + altaDacie);
            System.out.println(altaDacie.make);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
