package com.nttdata.test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB {
    String url;
    String user;
    String password;
    Connection conn = null;

    public PostgresDB() {
        url = "jdbc:postgresql://localhost/db1";
        user = "postgres";
        password = "nttdata";
    }

    public Connection connectToDatabase() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connect to DB. ok!");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return conn;
    }

}
