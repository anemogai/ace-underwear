package com.anemogai.ace.underwear.community.database;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTestConnection {

    private static final String url = "jdbc:mysql://localhost:3306/?user=root";
    private static final String username = "root";
    private static final String password = "n.ananas1616";
    private Connection connection;

    @Test
    public boolean connect() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Test
    public boolean disconnect() {
        try {
            System.out.println("Disconnected!");
            connection.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Failure...");
        }
        return false;
    }
}
