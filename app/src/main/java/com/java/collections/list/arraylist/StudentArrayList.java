package com.java.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentArrayList {
    public static void main(String[] args) {
        // Creating user-defined class objects
        Student s1 = new Student(101, "Sonoo", 23);
        Student s2 = new Student(102, "Ravi", 21);
        Student s3 = new Student(103, "Hanumat", 25);

        // creating arraylist
        List<Student> students = new ArrayList<>();

        // adding Student class object
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // Getting Iterator
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.rollno + " " + student.name + " " + student.rollno);
        }
    }
}
