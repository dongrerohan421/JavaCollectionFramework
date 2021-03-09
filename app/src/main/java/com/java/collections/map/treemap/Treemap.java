package com.java.collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        // Creating Map using TreeMap
        Map<String, Integer> values = new TreeMap<>();

        // Insert an elements into map
        values.put("Second", 2);
        values.put("First", 1);
        System.out.println("Map using TreeMap: " + values);

        // Replacing the values
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map:" + values);

        // Remove elements from map
        int removedValue = values.remove("Second");
        System.out.println("Removed value: " + removedValue);
        System.out.println("Map after removed values: " + values);

    }
}
