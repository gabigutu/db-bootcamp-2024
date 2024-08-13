package com.mobile.tryresources;

public class Catalog implements AutoCloseable {

    String serie;
    int grupa;

    public Catalog(String serie, int grupa) {
        System.out.println("Incarc catalogul de la " + grupa + serie );
        this.serie = serie;
        this.grupa = grupa;
    }

    public void printStudents() {
        System.out.println("Afisez studentii de la " + grupa + serie ); // 321CA
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing catalogue for " + serie + " " + grupa);
    }
}
