// CreateTable.java - Q13: Create table in database
import java.sql.*;

public class CreateTable {
    public static void main(String[] args) throws Exception {
        // SQLite (Works instantly with zero database setup)
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:test.db");

        // MySQL (Uncomment if using MySQL in your lab):
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb", "root", "root");

        Statement st = con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(20), marks INT)");
        System.out.println("Table 'student' created successfully.");
        con.close();
    }
}
