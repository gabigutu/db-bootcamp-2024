package com.mobile.design_patterns.decorator;

// extern
public class EmailLogger implements ILogger {

    private String email;

    public EmailLogger(String email) {
        this.email = email;
    }

    @Override
    public void logMessage(String message) {
        sendEmail(message);
    }

    void sendEmail(String message) {
        System.out.println("Sending email to " + email + " with the following body: " + message);
    }


}
