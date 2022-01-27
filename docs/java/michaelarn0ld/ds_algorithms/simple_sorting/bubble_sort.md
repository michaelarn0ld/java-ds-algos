# Bubble Sort
Bubble sort is notoriously slow; however, it is a conceptually simple sorting
algorithm that serves as a good base for diving into more complex topics. The
rules for Bubble Sort are:

1. Compare two values
1. If the one on the left is greater than the one on the right, then swap them
1. Move right one position.
1. Repeat the above until you get to the end of the array

These rules represent a single pass in bubble sort. By the end of the first pass,
it is guaranteed that the value at the rightmost edge will be the greatest value.

In order to fully sort, when you reach the end of the array, you simply repeat the
entire sequence from the leftmost (first) element; however, the catch is that we
no longer need to check the rightmost element this time because we know that it
is the greatest value.

Consider the following:

```
At the start of the first pass...
[1, 3, 8, 2, 6, 2]

At the start of the second pass...
[1, 3, 2, 6, 2, 8]
                ^
        No need to compare this element

At the start of the third pass...
[1, 2, 3, 2, 6, 8]
             ^  ^
        No need to compare these element elements
```

## Time Complexity
* In general, where N is the number of elements in the array, there are (N-1)
comparisons on the first pass, (N-2) comparisons on the second pass and so on.

* Each pass is occuring in the outer loop; the comparisons are occuring in the
inner loop

* The equation for such a pattern -> (N-1) + (N-2) + ... + 1 = N*(N-1)/2 which
is roughly (N^2)/2

* There are fewer swaps because we only swap when we need to while we make 
comparisons every time. Given random data, the need for swaps occurs about half
the time. So, there are roughly (N^2)/4 swaps.

* Both swaps and comparisons are proportional to N^2. The time complexity for 
Bubble Sort is O(N^2)
