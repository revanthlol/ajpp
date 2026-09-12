// Prog02_ComparableDemo.java
// Unit 1: Write a Java program to implement the Comparable interface.

import java.util.ArrayList;
import java.util.Collections;

// Student class implements Comparable to define natural sorting order
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int marks;

    // Constructor
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Implementing compareTo method (sorting in ascending order by marks)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    // Display format
    @Override
    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Prog02_ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "Alice", 85));
        list.add(new Student(102, "Bob", 72));
        list.add(new Student(103, "Charlie", 95));
        list.add(new Student(104, "David", 60));

        System.out.println("--- Before Sorting ---");
        for (Student s : list) {
            System.out.println(s);
        }

        // Collections.sort() uses compareTo() implementation
        Collections.sort(list);

        System.out.println("\n--- After Sorting by Marks (Ascending) ---");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
