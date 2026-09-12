// Prog13_CreateTable.java
// Unit 2: Write a Java program to create a table in a database.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Prog13_CreateTable {

    // ==============================================================
    // Database Credentials:
    // Configured for SQLite by default so it runs instantly without setup!
    // For MySQL in college lab, uncomment MySQL lines below.
    // ==============================================================
    static final String DRIVER = "org.sqlite.JDBC";
    static final String URL = "jdbc:sqlite:college.db";
    static final String USER = "";
    static final String PASS = "";

    /*
    // --- MySQL Configuration (for college lab exams) ---
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/collegedb";
    static final String USER = "root";
    static final String PASS = "root";
    */

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Step 1: Register JDBC driver
            Class.forName(DRIVER);

            // Step 2: Open database connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Database connected successfully.");

            // Step 3: Create Statement object
            stmt = conn.createStatement();

            // Step 4: Execute SQL DDL query to create table
            String sql = "CREATE TABLE IF NOT EXISTS students (" +
                         "id INT PRIMARY KEY, " +
                         "name VARCHAR(50), " +
                         "course VARCHAR(50), " +
                         "marks DOUBLE);";

            stmt.executeUpdate(sql);
            System.out.println("Table 'students' created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 5: Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("Connection closed.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
