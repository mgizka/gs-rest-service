package com.example.restservice;

import java.sql.*;
import java.net.URISyntaxException;

public class DbUtil {

    public static Connection getConnection() throws URISyntaxException, SQLException {
        String dbUrl = System.getenv("JDBC_DATABASE_URL");
        return DriverManager.getConnection(dbUrl);
    }
}