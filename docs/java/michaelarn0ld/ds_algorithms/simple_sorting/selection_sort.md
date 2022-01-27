# Selection Sort
The basic idea of selection sort is as follows:

1. Make a pass through the array and select the element who has the minimum
value
1. After the pass, swap the minimum element with the leftmost element at index
0.

Now, the leftmost element is sorted and will not need to be moved again. In this
algorithm, sorting accumulates at the lower indices where as in bubble sort they
accumulate at the higher indices. Consider the following:

```
At the start of the first pass...
[2, 3, 1, 6, 4, 7, 6]

At the start of the second pass...
[1, 3, 2, 6, 4, 7, 6]
 ^
 Don't need to move or compare this element

 At the start of the third pass...
[1, 2, 3, 6, 4, 7, 6]
 ^  ^
 Don't need to move or compare these elements
```

The key takeaway here is that swaps only occur once per outer pass. In the inner
loop, we are simply determining the minimum of the remaining unsorted elements.
Once we have that minimum, we put it at the current index of the outer loop.


## Time Complexity

* Like Bubble sort, for an N element array, there are (N-1) comparisons on the
first pass, (N-2) comparisons on the second pass, and so on. This means that in
general, we make (N^2)/2 comparisons

* We only make swaps once per outer pass; for an N element array, there will
be less than N total swaps.

* For large N, the time constraint of comparisons dominates, so we say that 
Selection Sort runs in O(N^2) time
