// Prog05_JavaBeanDemo.java
// Unit 2: Write a Java program to create a simple JavaBean.

import java.io.Serializable;

// 1. JavaBean Class: Must implement Serializable
class StudentBean implements Serializable {
    // 2. Private properties (Encapsulation)
    private int id;
    private String name;
    private double gpa;

    // 3. Public no-argument constructor
    public StudentBean() {
    }

    // 4. Public Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

// Test / Driver class to demonstrate JavaBean
public class Prog05_JavaBeanDemo {
    public static void main(String[] args) {
        // Instantiate the JavaBean
        StudentBean student = new StudentBean();

        // Setting values using Setter methods
        student.setId(101);
        student.setName("Rahul Sharma");
        student.setGpa(8.9);

        // Accessing values using Getter methods
        System.out.println("--- Student JavaBean Details ---");
        System.out.println("Student ID   : " + student.getId());
        System.out.println("Student Name : " + student.getName());
        System.out.println("Student GPA  : " + student.getGpa());
    }
}
