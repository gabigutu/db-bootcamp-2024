package com.mobile.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Newsletter {

    private String website;
    private List<Subscriber> subscribers;

    public Newsletter(String website) {
        this.website = website;
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void generateNewsletter() {
        StringBuilder newsletter = new StringBuilder();
        newsletter.append(website);
        newsletter.append(": ");
        newsletter.append("Some new newsletter " + Math.random());
        broadcast(newsletter.toString());
    }

    private void broadcast(String newsletterMessage) {
        for (Subscriber subscriber : subscribers) {
            subscriber.receiveNotification(newsletterMessage);
        }
    }

}
