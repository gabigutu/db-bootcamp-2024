package com.mobile.generics.catalog;

public class Catalog<E, I> {

    E[] entries;
    I[] items;  // entries[3] <=> items[3]
    int lastIndex;

    public Catalog() {
        entries = (E[]) new Object[30];
        items = (I[]) new Object[30];
        lastIndex = 0;
    }

    public void addEntry(E entry) {
        addEntry(entry, null);
    }

    public void addEntry(E entry, I item) {
        entries[lastIndex] = entry;
        items[lastIndex] = item;
        lastIndex++;
    }

    public E getEntry(int index) {
        return entries[index];
    }

    public void printEntries() {
        for (int i = 0; i < lastIndex; i++) {
            System.out.println(entries[i] + " <=> " + items[i]);
        }
    }

    public static void main(String[] args) {
        Catalog<Student, Laptop> catalogStudenti = new Catalog();
        Catalog<Elev, Ghiozdan> catalogElevi = new Catalog();

        for (int i = 0; i < 10; i++) {
            // Math.random() * 4 => [0; 4) ;
            Student student = new Student("Student " + i, (int) Math.ceil(Math.random() * 4));
            Laptop laptop = new Laptop();
            catalogStudenti.addEntry(student, laptop);

            Elev elev = new Elev("Elev " + i, (int) Math.ceil(Math.random() * 12));
            Ghiozdan ghiozdan = new Ghiozdan();
            catalogElevi.addEntry(elev, ghiozdan);
//            catalogElevi.addEntry(elev, laptop); // can't do this since I is Ghiozdan for elevi
        }

        catalogStudenti.printEntries();
        catalogElevi.printEntries();


        System.out.println("Student[3] = " + catalogStudenti.getEntry(3));
        System.out.println("Elev[3] = " + catalogElevi.getEntry(3));
    }
}
