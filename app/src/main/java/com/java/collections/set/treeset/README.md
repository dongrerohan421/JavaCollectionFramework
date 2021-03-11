# Java TreeSet

Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface. The objects of the TreeSet class are stored in ascending order.

The important points about Java TreeSet class are:

- Java TreeSet class contains unique elements only like HashSet.
- Java TreeSet class access and retrieval times are quiet fast.
- Java TreeSet class doesn't allow null element.
- Java TreeSet class is non synchronized.
- Java TreeSet class maintains ascending order.

### Hierarchy of TreeSet class

As shown in the below diagram, Java TreeSet class implements the NavigableSet interface. The NavigableSet interface extends SortedSet, Set, Collection and Iterable interfaces in hierarchical order.

![Alt text](/app/src/main/resources/images/set/treeset/treeset.png "Java TreeSet")

### TreeSet class declaration

Let's see the declaration for *java.util.TreeSet* class.
```
public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable
```

### Constructors of Java TreeSet class

|Constructor | Description |
| :--------- | :---------- |
|`TreeSet()`|It is used to construct an empty tree set that will be sorted in ascending order according to the natural order of the tree set.|
|`TreeSet(Collection<? extends E> c)`|It is used to build a new tree set that contains the elements of the collection c.|
|`TreeSet(Comparator<? super E> comparator)`|It is used to construct an empty tree set that will be sorted according to given comparator.|
|`TreeSet(SortedSet<E> s)`|It is used to build a TreeSet that contains the elements of the given SortedSet.|

### Methods of Java TreeSet class
|Method| Description |
| :--------- | :---------- |
|`boolean add(E e)`|It is used to add the specified element to this set if it is not already present.|
|`boolean addAll(Collection<? extends E> c)`|It is used to add all of the elements in the specified collection to this set.|
|`E ceiling(E e)`|It returns the equal or closest greatest element of the specified element from the set, or null there is no such element.|
|`Comparator<? super E> comparator()`|It returns comparator that arranged elements in order.|
|`Iterator descendingIterator()`|It is used iterate the elements in descending order.|
|`NavigableSet descendingSet()`|It returns the elements in reverse order.|
|`E floor(E e)`|It returns the equal or closest least element of the specified element from the set, or null there is no such element.|
|`SortedSet headSet(E toElement)`|It returns the group of elements that are less than the specified element.|
|`NavigableSet headSet(E toElement, boolean inclusive)`|It returns the group of elements that are less than or equal to(if, inclusive is true) the specified element.|
|`E higher(E e)`|It returns the closest greatest element of the specified element from the set, or null there is no such element.|
|`Iterator iterator()`|It is used to iterate the elements in ascending order.|
|`E lower(E e)`|It returns the closest least element of the specified element from the set, or null there is no such element.|
|`E pollFirst()`|It is used to retrieve and remove the lowest(first) element.|
|`E pollLast()`|It is used to retrieve and remove the highest(last) element.|
|`Spliterator spliterator()`|It is used to create a late-binding and fail-fast spliterator over the elements.|
|`NavigableSet subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)`|It returns a set of elements that lie between the given range.|
|`SortedSet subSet(E fromElement, E toElement))`|It returns a set of elements that lie between the given range which includes fromElement and excludes toElement.|
|`SortedSet tailSet(E fromElement)`|It returns a set of elements that are greater than or equal to the specified element.|
|`NavigableSet tailSet(E fromElement, boolean inclusive)`|It returns a set of elements that are greater than or equal to (if, inclusive is true) the specified element.|
|`boolean contains(Object o)`|It returns true if this set contains the specified element.|
|`boolean isEmpty()`|It returns true if this set contains no elements.|
|`boolean remove(Object o)`|It is used to remove the specified element from this set if it is present.|
|`void clear()`|It is used to remove all of the elements from this set.|
|`Object clone()`|It returns a shallow copy of this TreeSet instance.|
|`E first()`|It returns the first (lowest) element currently in this sorted set.|
|`E last()`|It returns the last (highest) element currently in this sorted set.|
|`int size()`|It returns the number of elements in this set.|