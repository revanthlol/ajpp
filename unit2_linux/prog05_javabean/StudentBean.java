// StudentBean.java - Q5: Simple JavaBean
import java.io.Serializable;

public class StudentBean implements Serializable {
    private int id;
    private String name;

    // 1. Public no-argument constructor
    public StudentBean() {}

    // 2. Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Test runner
    public static void main(String[] args) {
        StudentBean s = new StudentBean();
        s.setId(101);
        s.setName("Rahul");
        System.out.println("Student ID   : " + s.getId());
        System.out.println("Student Name : " + s.getName());
    }
}
