package com.mobile.basics.finall;

public class ElevEminent /* extends Elev  */ {
    // cannot extend because Elev is final

    final int medie = 10;
    final boolean bursa;

    public ElevEminent() {
        bursa = true;
    }

    void setMedie(int medie) {
//        this.medie = medie; // cannot do this
//        this.bursa = false; // cannot do this
    }

}
