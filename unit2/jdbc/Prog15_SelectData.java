// Prog15_SelectData.java
// Unit 2: Write a Java program to perform a SELECT operation on a database.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prog15_SelectData {

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
        ResultSet rs = null;

        try {
            // Step 1: Register JDBC driver
            Class.forName(DRIVER);

            // Step 2: Open connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(URL, USER, PASS);

            // Step 3: Create Statement and execute SELECT query
            stmt = conn.createStatement();
            String sql = "SELECT id, name, course, marks FROM students;";
            rs = stmt.executeQuery(sql);

            // Step 4: Process and display ResultSet
            System.out.println("\n---------------------------------------------------------");
            System.out.printf("%-10s %-15s %-15s %-10s\n", "ID", "Name", "Course", "Marks");
            System.out.println("---------------------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String course = rs.getString("course");
                double marks = rs.getDouble("marks");

                System.out.printf("%-10d %-15s %-15s %-10.2f\n", id, name, course, marks);
            }
            System.out.println("---------------------------------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 5: Close resources in reverse order
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("Connection closed.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
