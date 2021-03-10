# Java LinkedHashSet

Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. It inherits HashSet class and implements Set interface.

The important points about Java LinkedHashSet class are:

- Java LinkedHashSet class contains unique elements only like HashSet.
- Java LinkedHashSet class provides all optional set operation and permits null elements.
- Java LinkedHashSet class is non synchronized.
- Java LinkedHashSet class maintains insertion order.

### Hierarchy of LinkedHashSet class

The LinkedHashSet class extends HashSet class which implements Set interface. The Set interface inherits Collection and Iterable interfaces in hierarchical order.

![Alt text](/app/src/main/resources/images/set/linkedhashset/linkedhashset.png "Java LinkedHashSet")

### LinkedHashSet class declaration

Let's see the declaration for *java.util.LinkedHashSet* class.
```
public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable  
```

### Constructors of Java LinkedHashSet class

|Constructor | Description |
| :--------- | :---------- |
|`HashSet()`|It is used to construct a default HashSet.|
|`HashSet(Collection c)`|It is used to initialize the hash set by using the elements of the collection c.|
|`LinkedHashSet(int capacity)`|It is used initialize the capacity of the linked hash set to the given integer value capacity.|
|`LinkedHashSet(int capacity, float fillRatio)`|It is used to initialize both the capacity and the fill ratio (also called load capacity) of the hash set from its argument.|