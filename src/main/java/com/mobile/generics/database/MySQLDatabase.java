package com.mobile.generics.database;

public class MySQLDatabase implements IDatabase<MySQLConnection> {
    @Override
    public void connect(MySQLConnection connection) {
        connection.connect();
    }
}
