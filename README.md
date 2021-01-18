# JAVA COLLECTIONS

### SETS, MAPS, TREES AND QUEUES

### Problems with array.
- cannot resize
- deleting is hard
- finding index of an item in the array is hard
- does not enforce constraints like adding duplicates


### Collections framework implement multiple datastructures like queues, hashmaps, hashtables, resizable arays, trees

using these datastructures is very common that is why it ships with the jdk

- we use the collections framework because there is no need to reinvent the wheel.
- the reason why it is called a framework is because it provides a very diverse implementation of datastructures.


- collections with defined iteration order: Lists
- collections with unique contraints: Sets
- collections with orders contraints: queues and deques (Double ended queues)
- collections of key-value pairs: Maps


Lists:
  - arraylist, linkedlist
    adding items is better in linked list, but retrieving items is better in arraylists
  
  - Map: HashMap,
  - SortedMap: TreeMap

  - Set: HashSet
  - SortedSet: TreeSet

  - Queues: Priority Queue
  - Deque: LinkedList, ArrayDeque


### How do we decide on which data structure to use