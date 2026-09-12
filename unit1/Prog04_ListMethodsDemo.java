// Prog04_ListMethodsDemo.java
// Unit 1: Write a Java program implementing various methods of LinkedList and ArrayList.

import java.util.ArrayList;
import java.util.LinkedList;

public class Prog04_ListMethodsDemo {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("         DEMONSTRATION OF ARRAYLIST           ");
        System.out.println("==============================================");

        // 1. ArrayList Methods
        ArrayList<String> arrayList = new ArrayList<>();

        // add() and add(index, element)
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add(1, "Kotlin"); // Insert at index 1
        System.out.println("Initial ArrayList: " + arrayList);

        // get(index)
        System.out.println("Element at index 2: " + arrayList.get(2));

        // set(index, element) - updates element
        arrayList.set(2, "Ruby");
        System.out.println("After set(2, 'Ruby'): " + arrayList);

        // contains()
        System.out.println("Contains 'Java'? " + arrayList.contains("Java"));

        // remove(index)
        arrayList.remove(0); // removes "Java"
        System.out.println("After remove(0): " + arrayList);

        // size()
        System.out.println("ArrayList size: " + arrayList.size());


        System.out.println("\n==============================================");
        System.out.println("         DEMONSTRATION OF LINKEDLIST          ");
        System.out.println("==============================================");

        // 2. LinkedList Methods
        LinkedList<String> linkedList = new LinkedList<>();

        // Standard add()
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        System.out.println("Initial LinkedList: " + linkedList);

        // addFirst() and addLast()
        linkedList.addFirst("Black");
        linkedList.addLast("White");
        System.out.println("After addFirst('Black') & addLast('White'): " + linkedList);

        // getFirst() and getLast()
        System.out.println("First Element: " + linkedList.getFirst());
        System.out.println("Last Element : " + linkedList.getLast());

        // removeFirst() and removeLast()
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removeFirst() & removeLast(): " + linkedList);

        // size()
        System.out.println("LinkedList size: " + linkedList.size());
    }
}
