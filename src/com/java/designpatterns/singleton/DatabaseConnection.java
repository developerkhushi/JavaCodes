package com.java.designpatterns.singleton;

public class DatabaseConnection {

    private static volatile DatabaseConnection dbc = null;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {

        if (dbc == null) {
            synchronized (DatabaseConnection.class) {
                if (dbc == null) {
                    dbc = new DatabaseConnection();
                }
            }
        }
        return dbc;
    }
}
