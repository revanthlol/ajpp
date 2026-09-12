// Prog03_MapComparison.java
// Unit 1: Write a Java program to differentiate between different Map classes.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Prog03_MapComparison {
    public static void main(String[] args) {
        // Data to insert (keys inserted in arbitrary order)
        int[] keys = {40, 10, 50, 20, 30};
        String[] values = {"Forty", "Ten", "Fifty", "Twenty", "Thirty"};

        // 1. HashMap: No guaranteed order (based on hash code)
        Map<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            hashMap.put(keys[i], values[i]);
        }

        // 2. LinkedHashMap: Maintains insertion order
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < keys.length; i++) {
            linkedHashMap.put(keys[i], values[i]);
        }

        // 3. TreeMap: Sorted order of keys (Natural ascending order)
        Map<Integer, String> treeMap = new TreeMap<>();
        for (int i = 0; i < keys.length; i++) {
            treeMap.put(keys[i], values[i]);
        }

        System.out.println("Inserted order of keys: [40, 10, 50, 20, 30]\n");

        System.out.println("1. HashMap (Unordered / Hash-based):");
        System.out.println("   " + hashMap);

        System.out.println("\n2. LinkedHashMap (Preserves Insertion Order):");
        System.out.println("   " + linkedHashMap);

        System.out.println("\n3. TreeMap (Sorted by Key in Ascending Order):");
        System.out.println("   " + treeMap);

        System.out.println("\n--- Key Differences ---");
        System.out.println("- HashMap       : Fast O(1), No order guarantee, allows 1 null key.");
        System.out.println("- LinkedHashMap : Maintains insertion order, allows 1 null key.");
        System.out.println("- TreeMap       : Sorted order O(log n), does NOT allow null keys.");
    }
}
