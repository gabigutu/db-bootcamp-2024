package com.mobile.database;

public class MySQLDatabase implements IDatabase {
    @Override
    public void connect() {
        System.out.println("MySQL connected");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL disconnected");
    }

    void limit() {
        System.out.println("Select with limit");
    }
}
