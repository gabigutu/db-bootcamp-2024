package com.mobile.design_patterns.observer;

public class Subscriber {

    private String firstName;
    private String lastName;

    public Subscriber(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void subscribe(Newsletter newsletter) {
        newsletter.subscribe(this);
    }

    public void receiveNotification(String message) {
        System.out.println(firstName + " " + lastName + " received notification: " + message);
    }

}
