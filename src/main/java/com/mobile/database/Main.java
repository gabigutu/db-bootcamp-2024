package com.mobile.database;

public class Main {

    public static void main(String[] args) {
        IDatabase database = new MSSQLDatabase();
        database.connect();
        if (database instanceof MySQLDatabase) {
            ((MySQLDatabase)database).limit();
        }
        else if (database instanceof MSSQLDatabase) {
            ((MSSQLDatabase)database).limitSimulator();
        }
        database.disconnect();


    }
}
