package com.mobile.mamifer;

public class Main {
    public static void main(String[] args) {

        Mamifer vasilica = new Om("Vasilica");

        long x = 3344l;
        int y = (int) x;

        Mamifer tom = new Pisica();
        ((Pisica) tom).daCuGheara();
        Mamifer monkey = new Maimuta();
        ((Maimuta) monkey).seCatara();

        if (monkey instanceof Pisica) {
            ((Pisica) monkey).daCuGheara();
        }
        if (tom instanceof Pisica) {
            ((Pisica) tom).daCuGheara();
        }



    }
}
