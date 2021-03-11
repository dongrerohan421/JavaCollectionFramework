package com.java.collections.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class JavaHashSet {
    public static void main(String[] args) {
        addElements();
        ignoreDuplicateElements();
        removeElements();
        hashSetFromAnotherCollection();
    }

    public static void addElements() {
        // Creating HashSet and adding elements
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println("Notice, the elements iterate in an unordered collection:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void ignoreDuplicateElements() {
        HashSet<String> set = new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        System.out.println("\nHashSet doesn't allow duplicate elements:");
        // Traversing elements
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void removeElements() {
        HashSet<String> set = new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("\nAn initial list of elements: " + set);
        // Removing specific element from HashSet
        set.remove("Ravi");
        System.out.println("After invoking remove(object) method: " + set);

        HashSet<String> set1 = new HashSet<>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: " + set);

        // Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: " + set);

        // Removing elements on the basis of specified condition
        set.removeIf(str -> str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: " + set);

        // Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: " + set);
    }

    public static void hashSetFromAnotherCollection() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ravi");
        arrayList.add("Vijay");
        arrayList.add("Ajay");

        HashSet<String> hashSet = new HashSet<>(arrayList);
        hashSet.add("Gaurav");

        System.out.println("\nJava HashSet from another Collection:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
