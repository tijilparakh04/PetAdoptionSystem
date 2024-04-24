/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

/**
 *
 * @author Udisha
 */
import java.sql.*;

public class DatabaseUtil {
    private Connection conn;

    // Constructor to establish database connection
    public DatabaseUtil() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_project", "root", "yoyoyo1483");
            System.out.println("Connected successfully");
        } catch (Exception e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }

    // Method to execute SELECT query
    public ResultSet executeQuery(String query) {
        try {
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
            return null;
        }
    }

    // Method to execute INSERT, UPDATE, DELETE queries
    public int executeUpdate(String query) {
        try {
            Statement stmt = conn.createStatement();
            return stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error executing update: " + e.getMessage());
            return -1;
        }
    }

    // Close the database connection
    public void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Database connection closed");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}
