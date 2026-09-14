// InsertData.java - Q14: Insert data into table
import java.sql.*;

public class InsertData {
    public static void main(String[] args) throws Exception {
        // SQLite (Works instantly with zero database setup)
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:test.db");

        // MySQL (Uncomment if using MySQL in your lab):
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb", "root", "root");

        // Ensure table exists so program runs standalone
        Statement st = con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(20), marks INT)");

        String sql = "INSERT INTO student (id, name, marks) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, 101);
        ps.setString(2, "Alice");
        ps.setInt(3, 85);
        ps.executeUpdate();

        System.out.println("Record inserted successfully.");
        con.close();
    }
}
