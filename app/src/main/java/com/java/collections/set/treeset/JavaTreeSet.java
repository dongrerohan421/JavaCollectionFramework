package com.java.collections.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        addElementsInAscendingOrder();
        addElementsInDescendingOrder();
        highestAndLowestValue();
        navigableSetOperations();
        sortedSetOperations();
    }

    private static void addElementsInAscendingOrder() {
        // Creating and adding elements
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Ravi");
        treeSet.add("Vijay");
        treeSet.add("Ravi");
        treeSet.add("Ajay");

        System.out.println("\nAdding the elements in ascending order:");

        // Traversing elements
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void addElementsInDescendingOrder() {
        // Creating and adding elements
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Ravi");
        treeSet.add("Vijay");
        treeSet.add("Ravi");
        treeSet.add("Ajay");

        System.out.println("\nAdding the elements in descending order:");

        // Traversing elements
        Iterator<String> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private static void highestAndLowestValue() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(24);
        treeSet.add(66);
        treeSet.add(12);
        treeSet.add(15);
        System.out.println("\nHighest value: " + treeSet.pollFirst());
        System.out.println("Lowest value: " + treeSet.pollLast());
    }

    private static void navigableSetOperations() {
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("\nNavigable Set operations:");
        System.out.println("\nInitital set: " + set);
        System.out.println("Reverse set: " + set.descendingSet());
        System.out.println("Head set: " + set.headSet("C", true));
        System.out.println("SubSet: " + set.subSet("A", false, "E", true));
        System.out.println("TailSet: " + set.tailSet("C", false));
    }

    private static void sortedSetOperations() {
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("\nSorted Set operations:");
        System.out.println("\nInitital set: " + set);
        System.out.println("Reverse set: " + set.descendingSet());
        System.out.println("Head set: " + set.headSet("C"));
        System.out.println("SubSet: " + set.subSet("A", "E"));
        System.out.println("TailSet: " + set.tailSet("C"));
    }

}
