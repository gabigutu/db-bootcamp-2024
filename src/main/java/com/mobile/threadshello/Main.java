package com.mobile.threadshello;

public class Main {

    public static void main(String[] args) {

//        Employee employee1 = new Employee("Eduard");
//        Employee employee2 = new Employee("Alexandru");
//        employee1.start();
//        employee2.start();

        Employee[] employees = new Employee[30];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("Employee " + i);
            employees[i].start();
        }

        int i = 0;
        try {
            for (i = 0; i < employees.length; i++) {
                employees[i].join();
            }
        } catch (InterruptedException e) {
            System.out.println("Nu am reusit sa dau join la thread-ul " + i + " (message = " + e.getMessage() + ")");
        }

        System.out.println("(Employee) Tmain says hello");

        Angajat[] angajati = new Angajat[30];
        Thread[] threadsAngajati = new Thread[30];
        for (i = 0; i < angajati.length; i++) {
            angajati[i] = new Angajat("Angajat " + i);
            threadsAngajati[i] = new Thread(angajati[i]); // 30 refe
            threadsAngajati[i].start(); // ??????
        }

        try {
            for (i = 0; i < angajati.length; i++) {
                threadsAngajati[i].join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("(Angajat) Tmain says hello");

        // TODO: Make it ArrayList

    }
}
