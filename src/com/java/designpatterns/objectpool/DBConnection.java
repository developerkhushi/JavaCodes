package com.java.designpatterns.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;

// Resource - Reusable Object
public class DBConnection {

    Connection mysqlConnection;

    public DBConnection() {
        try {
            mysqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB", "root",
                    "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
