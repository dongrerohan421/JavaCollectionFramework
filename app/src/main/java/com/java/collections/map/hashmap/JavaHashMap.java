package com.java.collections.map.hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        addEntries();
        removeEntries();
        replaceEntries();
        comparingByKey();
        comparingByKeyInDescendingOrder();
        comparingByValue();
        comparingByValueInDescendingOrder();
    }

    private static void addEntries() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Mango");
        hashMap.put(2, "Apple");
        hashMap.put(3, "Banana");
        hashMap.put(4, "Grapes");

        System.out.println("After invoking put() method: ");
        // Iterating HashMap
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        hashMap.putIfAbsent(5, "Strawberry");
        System.out.println("\nAfter invoking putIfAbsent() method: ");

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(6, "Blueberry");
        hashMap.putAll(hashMap2);
        System.out.println("\nAfter invoking putAll() method: ");
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    private static void removeEntries() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Amit");
        hm.put(102, "Vijay");
        hm.put(103, "Rahul");
        hm.put(104, "Gaurav");

        System.out.println("\nInitial list of elements before removal: " + hm);
        // key-based removal
        hm.remove(101);
        System.out.println("Updated list of elements: " + hm);

        // //key-value pair based removal
        hm.remove(102, "Vijay");
        System.out.println("Updated list of elements: " + hm);
    }

    private static void replaceEntries() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Amit");
        hm.put(102, "Vijay");
        hm.put(103, "Rahul");
        hm.put(104, "Gaurav");

        System.out.println("\nInitial list of elements before replace(): ");
        for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        hm.replace(102, "Gaurav");
        System.out.println("\nUpdated list of elements: ");
        for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        hm.replace(102, "Gaurav", "Vijay");
        System.out.println("\nUpdated list of elements: ");
        for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        hm.replaceAll((k, v) -> "Ajay");
        System.out.println("\nUpdated list of elements: ");
        for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void comparingByKey() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Amit");
        hm.put(102, "Vijay");
        hm.put(103, "Rahul");

        System.out.println("\ncomparingByKey(): ");
        // Returns a Set view of the mappings contained in this map
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }

    private static void comparingByKeyInDescendingOrder() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Amit");
        hm.put(102, "Vijay");
        hm.put(103, "Rahul");

        System.out.println("\ncomparingByKeyInDescendingOrder(): ");
        // Returns a Set view of the mappings contained in this map
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
    }

    private static void comparingByValue() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Amit");
        hm.put(102, "Vijay");
        hm.put(103, "Rahul");

        System.out.println("\ncomparingByValue(): ");
        // Returns a Set view of the mappings contained in this map
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

    private static void comparingByValueInDescendingOrder() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Amit");
        hm.put(102, "Vijay");
        hm.put(103, "Rahul");

        System.out.println("\ncomparingByValueInDescendingOrder(): ");
        // Returns a Set view of the mappings contained in this map
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

}
