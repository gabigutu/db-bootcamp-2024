package com.mobile.design_patterns.observer;

public class Main {

    public static void main(String[] args) {
        Newsletter newsletterMobile = new Newsletter("mobileacademy.ro");
        Newsletter newsletterDb = new Newsletter("db.com");

        Subscriber subscriberVasile = new Subscriber("Vasile", "Popescu");
        subscriberVasile.subscribe(newsletterMobile);
        subscriberVasile.subscribe(newsletterDb);

        Subscriber subscriberDaniel = new Subscriber("Daniel", "Anghelescu");
        subscriberDaniel.subscribe(newsletterMobile);


        newsletterMobile.generateNewsletter();
        newsletterDb.generateNewsletter();


    }

}
