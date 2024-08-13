package com.mobile.generics.database;

public interface IDatabase<T> {

    void connect(T connection);

}
