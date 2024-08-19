package com.mobile.design_patterns.decorator;

public class Main {

    public static void main(String[] args) {
        EmailLogger emailLogger = new EmailLogger("test@db.com");
//        emailLogger.logMessage("There was an error");

        LoggerDecorator loggerDecorator = new LoggerDecorator(emailLogger);
        loggerDecorator.logMessage("There was an error");


    }
}
