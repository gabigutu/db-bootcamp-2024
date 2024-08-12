package com.mobile.database;

public class MSSQLDatabase implements IDatabase {
    @Override
    public void connect() {
        System.out.println("Microsoft SQL connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Microsoft SQL disconnected");
    }

    void limitSimulator() {
        //
    }
}
