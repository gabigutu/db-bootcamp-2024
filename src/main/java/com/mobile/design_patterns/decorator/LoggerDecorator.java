package com.mobile.design_patterns.decorator;

public class LoggerDecorator {

    private EmailLogger emailLogger;

    public LoggerDecorator(EmailLogger emailLogger) {
        this.emailLogger = emailLogger;
    }

    public void logMessage(String message) {
        System.out.println("Logging messaging " + message + " in file"); // plus alte lucruri
        emailLogger.logMessage(message);
    }



}
