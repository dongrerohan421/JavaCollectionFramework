package com.java.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class JavaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Amit");
        priorityQueue.add("Vijay");
        priorityQueue.add("Karan");
        priorityQueue.add("Jai");
        priorityQueue.add("Rahul");

        System.out.println("head: " + priorityQueue.element());
        System.out.println("head: " + priorityQueue.peek());

        System.out.println("\nIterating the Priority queue:");
        Iterator<String> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        priorityQueue.remove();
        priorityQueue.poll();
        System.out.println("\nAfter removing two elements:");
        Iterator<String> iterator2 = priorityQueue.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
