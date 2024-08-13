package com.mobile.generics.database;

import java.io.File;
import java.io.IOException;

public class NoSQLDatabase implements IDatabase<File> {
    @Override
    public void connect(File connection) {
        if (!connection.exists()) {
            try {
                connection.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
