# Java LinkedList

Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:

- Java LinkedList class can contain duplicate elements.
- Java LinkedList class maintains insertion order.
- Java LinkedList class is non synchronized.
- In Java LinkedList class, manipulation is fast because no shifting needs to occur.
- Java LinkedList class can be used as a *list, stack or queue*.

![Alt text](/app/src/main/resources/images/list/linkedlist/linkedlist.png "LinkedList")

### Hierarchy of LinkedList class

As shown in the above diagram, Java LinkedList class extends *AbstractSequentialList* class and implements *List* and *Deque* interfaces.

### Doubly Linked List

In the case of a doubly linked list, we can add or remove elements from both sides.

![Alt text](/app/src/main/resources/images/list/linkedlist/doubly-linked-list.png "Doubly Linked List")

### LinkedList class declaration

Let's see the declaration for *java.util.LinkedList* class.
```
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
```

### Constructors of Java LinkedList

|Constructor | Description |
| :--------- | :---------- |
|`LinkedList()`| It is used to construct an empty list.|
|`LinkedList(Collection<? extends E> c)`|It is used to construct a list containing the elements of the specified collection, in the order, they are returned by the collection's iterator.|

### Methods of Java LinkedList
|Constructor | Description |
| :--------- | :---------- |
| `void add(int index, E element)` | It is used to insert the specified element at the specified position in a list.|
|`boolean add(E e)`|It is used to append the specified element at the end of a list.|
|`boolean addAll(Collection<? extends E> c)`|It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.|
|`boolean addAll(int index, Collection<? extends E> c)`|It is used to append all the elements in the specified collection, starting at the specified position of the list.|
|`void addFirst(E e)`|It is used to insert the given element at the beginning of a list.|
|`void addLast(E e)`|It is used to append the given element to the end of a list.|
|`void clear()`|It is used to remove all of the elements from this list.|
|`Object clone()`|It is used to return a shallow copy of an ArrayList.|
|`boolean contains(Object o)`|It returns true if the list contains the specified element.|
|`Iterator<E> descendingIterator()`|It is used to return an iterator over the elements in a deque in reverse sequential order.|
|`E element()`|It is used to retrieve the first element of a list.|
|`E get(int index)`|It is used to fetch the element from the particular position of the list.|
|`E getFirst()`|It is used to return the first element in a list.|
|`E getLast()`|It is used to return the last element in a list.|
|`int indexOf(Object o)`|It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.|
|`int lastIndexOf(Object o)`|It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.|
|`ListIterator<E> listIterator(int index)`|It is used to return a list-iterator of the elements in proper sequence, starting at the specified position in the list.|
|`boolean offer(E e)`|It adds the specified element as the last element of a list.|
|`boolean offerFirst(E e)`|It inserts the specified element at the front of a list.|
|`boolean offerLast(E e)`|It inserts the specified element at the end of a list.|
|`E peek()`|It retrieves the first element of a list|
|`E peekFirst()`|It retrieves the first element of a list or returns null if a list is empty.|
|`E peekLast()`|It retrieves the last element of a list or returns null if a list is empty.|
|`E poll()`|It retrieves and removes the first element of a list.|
|`E pollFirst()`|It retrieves and removes the first element of a list, or returns null if a list is empty.|
|`E pollLast()`|It retrieves and removes the last element of a list, or returns null if a list is empty.|
|`E pop()`|It pops an element from the stack represented by a list.|
|`void push(E e)`|It pushes an element onto the stack represented by a list.|
|`E remove()`|It is used to retrieve and removes the first element of a list.|
|`E remove(int index)`|It is used to remove the element present at the specified position in the list.|
|`boolean remove(Object o)`|It is used to remove the first occurrence of the specified element.|
|`E removeFirst()`|It removes and returns the first element from a list.|
|`boolean removeFirstOccurrence(Object o)`|It is used to remove the first occurrence of the specified element in a list (when traversing the list from head to tail).|
|`E removeLast()`|It removes and returns the last element from a list.|
|`boolean removeLastOccurrence(Object o)`|It removes the last occurrence of the specified element in a list (when traversing the list from head to tail).|
|`E set(int index, E element)`|It replaces the element at the specified position in a list with the specified element.|
|`Object[] toArray()`|It is used to return an array containing all the elements in a list in proper sequence (from first to the last element).|
|`<T> T[] toArray(T[] a)`|It returns an array containing all the elements in the proper sequence (from first to the last element); the runtime type of the returned array is that of the specified array.|
|`int size()`|It is used to return the number of elements present in the list.|