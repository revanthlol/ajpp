// Prog01_IteratorDemo.java
// Unit 1: Write a Java program to access a collection using an Iterator.

import java.util.ArrayList;
import java.util.Iterator;

public class Prog01_IteratorDemo {
    public static void main(String[] args) {
        // 1. Create a collection (ArrayList)
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("--- Accessing Collection using Iterator ---");

        // 2. Get the Iterator from the collection
        Iterator<String> it = fruits.iterator();

        // 3. Traverse through elements using hasNext() and next()
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);
        }
    }
}
