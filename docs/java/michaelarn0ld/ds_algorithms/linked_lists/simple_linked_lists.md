# Simple Linked Lists
A linked list is represented by a pointer to the first node of the linked list. 
The first node is called the head. If the linked list is empty, then the value of
the head points to NULL.

```
(head -> tail): 1 -> 2 -> 3 -> NULL
```

Each node contains two parts:
* Some kind of data (integer, string, object, etc...)
* A reference to the next node; if there is no next node the reference points to
null

## Advantages Over Arrays
* Dynamic sizing
* Ease of insertion/deletion

## Drawbacks
* No random access, we have to access elements sequentially
* Extra memory required to store the references to each element of the list
* Not cache friendly because elements of a list are not contiguous as they are 
with arrays

## Time Complextity
Access i-th element: O(i)
Searching for k: O(N)
Inserting next to k: O(N)
Deleting k: O(N)
Insert element at current point: O(1)
Delete current element: O(1)
Insert element at front: O(1)
Insert element at end: O(N)