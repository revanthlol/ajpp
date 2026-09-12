// Prog14_InsertData.java
// Unit 2: Write a Java program to insert data into a table in a database.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prog14_InsertData {

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
        PreparedStatement pstmt = null;

        try {
            // Step 1: Register JDBC driver
            Class.forName(DRIVER);

            // Step 2: Open connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(URL, USER, PASS);

            // Step 3: Prepare INSERT statement with placeholders (?)
            String sql = "INSERT INTO students (id, name, course, marks) VALUES (?, ?, ?, ?);";
            pstmt = conn.prepareStatement(sql);

            // Record 1
            pstmt.setInt(1, 101);
            pstmt.setString(2, "Alice");
            pstmt.setString(3, "CSE");
            pstmt.setDouble(4, 88.5);
            pstmt.executeUpdate();

            // Record 2
            pstmt.setInt(1, 102);
            pstmt.setString(2, "Bob");
            pstmt.setString(3, "ECE");
            pstmt.setDouble(4, 76.0);
            pstmt.executeUpdate();

            // Record 3
            pstmt.setInt(1, 103);
            pstmt.setString(2, "Charlie");
            pstmt.setString(3, "MECH");
            pstmt.setDouble(4, 91.2);
            pstmt.executeUpdate();

            System.out.println("3 student records inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 4: Close resources
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
                System.out.println("Connection closed.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
