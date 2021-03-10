package com.java.collections.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class JavaLinkedHashSet {
    public static void main(String[] args) {
        addElements();
        ignoreDuplicateElements();
    }

    private static void addElements() {
        // Creating HashSet and adding elements
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Five");

        System.out.println("\nNotice that the elements iterate in insertion order:");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void ignoreDuplicateElements() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Vijay");
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Ajay");

        System.out.println("\nLinkedHashSet doesn't allow duplicate elements:");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
