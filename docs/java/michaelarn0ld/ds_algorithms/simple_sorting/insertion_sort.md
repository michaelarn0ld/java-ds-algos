# Insertion Sort

Let's use a baseball team to simulate the idea of insertion sort. Let's assume
we are sorting players by height where the shortest players are on the left and
the tallest players are on the right. Now, it is easier to describe insertion
sort if we consider a team that is already partially sorted.

Let's say there is some marker somewher near the middle of the line; at this
point in time, players on the left of the marker are already partially sorted.
This means that they may not be in their final positions, but each one is
taller than the person to their left In the following array, numbers represent
height:

```
[1, 3, 4, 5, 2, 4, 3]
             ^
        Marker here
```

What we need to do is insert the marked player into the correct position in the 
partially sorted group. We do this by going down the line and shifting players
of the partially sorted group rightward, making space for the marked player,
until the person we are about to shift is shorter than the marked player. The
resultant array looks like this:

```
[1, _, 3, 4, 5, 4, 3]
    ^
    Empty spot
```

Now, we put the marked player in the newly "empty spot" (though it is never
empty in the actual implementation because we shift elements right by copying)
and the marker moves one player to the right:

```
[1, 2, 3, 4, 5, 4, 3]
                ^
            Marker Here
```

Repeat this process until all unsorted players have been inserted!


## Time Complexity

On the first pass, the algorithm compares a maximum of 1 item. On the second
pass, it compares a maximum of two items, and so on:

1 + 2 + ... + (N - 1) = N*(N-1)/2

However, each pass, there is only an average of half the maximum number of
comparisons made before the insertion is found. So on average we find:

(N*(N-1)/2)/2 = N*(N-1)/4

Like other sorting routines, Insertion Sort runs O(N^2) for random data; however,
there are cases where it excels and where it fails. For data that is already
sorted are almost sorted, Insertion Performs well. When data is already sorted,
the time complexity is O(N). The closer you are to sorted, the more linear
your time complexity. On the flip side, if the data is inverse sorted, every
possible comparison and shift is carried out so Insertion Sort will run no
faster than Bubble Sort.
