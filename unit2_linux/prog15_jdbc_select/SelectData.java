// SelectData.java - Q15: Select data from table
import java.sql.*;

public class SelectData {
    public static void main(String[] args) throws Exception {
        // SQLite (Works instantly with zero database setup)
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:test.db");

        // MySQL (Uncomment if using MySQL in your lab):
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb", "root", "root");

        // Ensure table and sample data exist so program runs standalone
        Statement st = con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(20), marks INT)");
        st.executeUpdate("INSERT OR IGNORE INTO student VALUES (101, 'Alice', 85)");
        st.executeUpdate("INSERT OR IGNORE INTO student VALUES (102, 'Bob', 90)");

        ResultSet rs = st.executeQuery("SELECT * FROM student");

        System.out.println("ID\tNAME\tMARKS");
        System.out.println("----------------------");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getInt("marks"));
        }
        con.close();
    }
}
