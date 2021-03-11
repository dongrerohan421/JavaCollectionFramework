# Java Queue Interface

Java Queue interface orders the element in FIFO(*First In First Out*) manner. In FIFO, first element is removed first and last element is removed at last.

### Queue Interface declaration
```
public interface Queue<E> extends Collection<E>
```

### Methods of Java Queue Interface

| Method | Description |
| :----- | :---------- |
| `boolean add(object)` | It is used to insert an element in this queue and return true upon success.|
|`boolean offer(object)`|It is used to insert the specified element into this queue.|
|`Object remove()`|It is used to retrieves and removes the head of this queue.|
|`Object poll()`|It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.|
|`Object element()`|It is used to retrieves, but does not remove, the head of this queue.|
|`Object peek()`|It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.|

### PriorityQueue class

The PriorityQueue class provides the facility of using queue. But it does not orders the elements in FIFO manner. It inherits *AbstractQueue* class.

### PriorityQueue class declaration

Let's see the declaration for *java.util.PriorityQueue* class.
```
public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable
```

### Java Deque Interface

Java Deque Interface is a linear collection that supports element insertion and removal at both ends. Deque is an acronym for "double ended queue".

Deque Interface declaration
```
public interface Deque<E> extends Queue<E>
```

### Methods of Java Deque Interface
| Method | Description |
| :----- | :---------- |
| `boolean add(object)` | It is used to insert an element in this deque and return true upon success.|
|`boolean offer(object)`|It is used to insert the specified element into this deque.|
|`Object remove()`|It is used to retrieves and removes the head of this deque.|
|`Object poll()`|It is used to retrieves and removes the head of this deque, or returns null if this deque is empty.|
|`Object element()`|It is used to retrieves, but does not remove, the head of this deque.|
|`Object peek()`|It is used to retrieves, but does not remove, the head of this deque, or returns null if this queue is deque.|

### ArrayDeque class

The ArrayDeque class provides the facility of using deque and resizable-array. It inherits *AbstractCollection* class and implements the *Deque* interface.

The important points about ArrayDeque class are:

- Unlike Queue, we can add or remove elements from both sides.
- Null elements are not allowed in the ArrayDeque.
- ArrayDeque is not thread safe, in the absence of external synchronization.
- ArrayDeque has no capacity restrictions.
- ArrayDeque is faster than LinkedList and Stack.

### ArrayDeque Hierarchy

The hierarchy of ArrayDeque class is given in the figure displayed at the right side of the page.

### ArrayDeque class declaration

Let's see the declaration for *java.util.ArrayDeque* class.
```
public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable
```