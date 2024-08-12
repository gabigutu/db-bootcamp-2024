package com.mobile.studentexception;

public class NuAiVarstaPotrivitaException extends Exception {

    public NuAiVarstaPotrivitaException(int age) {
        super("Varsta ta nu e buna! " + "(varsta = " + age + ")");
    }
}
