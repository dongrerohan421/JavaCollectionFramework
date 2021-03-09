package com.java.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating ArrayList
        List<String> list = new ArrayList<>();

        // Adding object in arraylist
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        // Printing the arraylist object
        System.out.println("Printing arraylist:\n" + list);

        // Traversing list through Iterator
        System.out.println("\nTraversing list through Iterator: ");
        Iterator<String> iterator = list.iterator(); // getting the Iterator
        while (iterator.hasNext()) { // check if iterator has the elements
            System.out.println(iterator.next()); // printing the element and move to next
        }

        // Traversing list through for-each loop
        System.out.println("\nTraversing list through for-each loop: ");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Accessing the element
        System.out.println("\nAccessing the element");
        System.out.println("Returning element: " + list.get(1) + "\n"); // it will return the 2nd element, because index
                                                                        // starts from 0

        // changing the element
        list.set(1, "Dates");

        // Traversing list
        System.out.println("Traversing list after changing the element: ");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Sorting the list
        System.out.println("\nSorting the list:");
        Collections.sort(list);

        // Traversing list through the for-each loop
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("\nSorting list of numbers:");

        // Creating a list of numbers
        List<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        // sorting the list
        Collections.sort(list2);
        // Traversing list through the for-each loop
        for (Integer number : list2) {
            System.out.println(number);
        }

        // --------------------------------------------------------------------------------------------
        System.out.println("\nTraversing list through List Iterator:");
        // Here, element iterates in reverse order
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            String string = listIterator.previous();
            System.out.println(string);
        }

        System.out.println("\nTraversing list through for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nTraversing list through forEach() method:");
        // The forEach() method is a new feature, introduced in Java 8.
        list.forEach(System.out::println);// Here, we are using lambda expression

        System.out.println("\nTraversing list through forEachRemaining() method:");
        Iterator<String> iterator2 = list.iterator();
        iterator2.forEachRemaining(System.out::println);// Here, we are using lambda expression

        // --------------------------------------------------------------------------------------------
        // ArrayList example to add elements
        System.out.println("\nInitial list of elements: " + list);

        // Adding elements to the end of the list
        list.add("Kiwi");
        list.add("Orange");
        System.out.println("After invoking add(E e) method: " + list);

        // Adding an element at the specific position
        list.add(1, "Apple");
        System.out.println("After invoking add(int index, E element) method: " + list);

        List<String> list3 = new ArrayList<>();
        list3.add("Strawberry");
        list3.add("Blueberry");
        // Adding second list elements to the first list
        list.addAll(list3);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + list);

        List<String> list4 = new ArrayList<>();
        list4.add("Raspberry");
        list4.add("Pineapple");
        // Adding list4 elements to the first list at specific position
        list.addAll(1, list4);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + list);

        // --------------------------------------------------------------------------------------------
        // ArrayList example to remove elements
        System.out.println("\nInitial list of elements: " + list);
        // Removing specific element from arraylist
        list.remove("Dates");
        System.out.println("After invoking remove(object) method: " + list);
        // Removing element on the basis of specific position
        list.remove(0);
        System.out.println("After invoking remove(index) method: " + list);

        // Removing all the new elements from arraylist
        list.removeAll(list3);
        System.out.println("After invoking removeAll() method: " + list);

        // Removing elements on the basis of specified condition
        list.removeIf(str -> str.contains("Mango")); // Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: " + list);

        // Removing all the elements available in the list3
        System.out.println("Before invoking clear() method: " + list3);
        list3.clear();
        System.out.println("After invoking clear() method: " + list3);

        // --------------------------------------------------------------------------------------------
        // ArrayList example of retainAll() method
        list.retainAll(list4);
        System.out.println("Iterating the elements after retaining the elements of list4:");
        Iterator<String> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        // --------------------------------------------------------------------------------------------
        // ArrayList example of isEmpty() method
        System.out.println("\nIs list3 ArrayList Empty: " + list3.isEmpty());
        list3.add("Strawberry");
        list3.add("Blueberry");
        System.out.println("After Insertion");
        System.out.println("Is list3 ArrayList Empty: " + list3.isEmpty());
    }
}
