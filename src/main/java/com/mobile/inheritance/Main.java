package com.mobile.inheritance;

public class Main {
    public static void main(String[] args) {
        Student vasilica = new Student("Spiru");
//        vasilica.name = "Vasilica";
        vasilica.setName("Vasilica");
        vasilica.age = 23;
//        vasilica.faculty = "ACS"; // field faculty is private (encapsulation)
        vasilica.setFaculty("ACS");
        vasilica.saySomething("Buna, ce faceti?");
        vasilica.inscriereFacultate("ASE");
//        System.out.println(vasilica.faculty); // field faculty is private (encapsulation)
        System.out.println(vasilica.getFaculty());
        System.out.println("Vasilica toString: " + vasilica.toString()); // toString comes from Object (if it is not available in Student, or in Person)
//        System.out.println(vasilica.isScrolling()); // method is private (cannot be called outside of class)

        Person tataVasilica = new Person("Gigel", 49);
//        tataVasilica.name = "Tata Vasilica";
        tataVasilica.setName("Tata Vasilica");
        tataVasilica.age = 50;
        tataVasilica.saySomething("Fa-ti temele, Vasilica!");
//        tataVasilica.inscriereFacultate("UNIBUC");

    }
}
