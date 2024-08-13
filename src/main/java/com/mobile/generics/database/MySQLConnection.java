package com.mobile.generics.database;

public class MySQLConnection {

    private String hostname;
    private String database;
    private String username;
    private String password;

    public MySQLConnection(String hostname, String database, String username, String password) {
        this.hostname = hostname;
        this.database = database;
        this.username = username;
        this.password = password;
    }

    public void connect() {
        System.out.println("Connecting to database...");
    }
}
