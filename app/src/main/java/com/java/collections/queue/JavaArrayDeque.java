package com.java.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaArrayDeque {
    public static void main(String[] args) {
        // Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");

        // Traversing elements
        for (String string : deque) {
            System.out.println(string);
        }

        // Java ArrayDeque Example: offerFirst() and pollLast()
        Deque<String> deque2 = new ArrayDeque<>();
        deque2.offer("Arvind");
        deque2.offer("Vimal");
        deque2.add("Mukul");
        deque2.offer("Jai");

        System.out.println("\nAfter offerFirst Traversal:");
        for (String string : deque2) {
            System.out.println(string);
        }

        deque2.poll();
        deque2.pollFirst(); // It is same as poll()
        deque2.pollLast();

        System.out.println("\nAfter pollLast() Traversal:");
        for (String string : deque2) {
            System.out.println(string);
        }

    }
}
