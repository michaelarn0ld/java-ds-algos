# Big O Notation

"Big O Notation" allows programmers to quickly give a rough measure of the
efficiency of a given algorithm, without diving too deep. This standard derives
a relationship between the number of steps an algorithm takes (in the worst case)
and the size of its' input.

* For the below examples, K is some constant, indicating the speed of the 
processor, the efficiency of the compiler, or other extraneous factors.

## Insertion in an Unordered Array: O(1)

* Insertion into an unordered array is constant because it does not depend on how
many items are in the array; the new item is always placed in the next available
position.

* T = K


## Linear Search: O(N)

* On average, the number of comparisons made to find a specific item in an array
is half the size of the total number of items

* In the case where the item we are searching for is at the end of the array, then
the number of comparisons is equal to the total size of the array

* T = K * N


## Binary Search: O(LOG N)

* The maximum number of steps required to search for a given element in an
ordered array is proportional to the base 2 logarithm of its size.

* T = K * LOG2(N)

* Since all logarithms are related to other logarithms by some constant, we may
factor that out of the expression and obtain a more general form

* T = K * LOG(N)


## We Don't Need the Constant

* When comparing algorithms, the specific microprocessor it is running on, or
the language it is implemented in are trivial details. Consequentially, these
details are tied up in the constant K. As a result, we can omit them when we
express "Big O Notation"

* Here are some examples of "Big O Notation"

| Algorithm                    | Big O Notation
| -                            | -
| Linear Search                | O(N)
| Binary Search                | O(LOG N)
| Insertion (Unordered Array)  | O(1)
| Insertion (Ordered Array)    | O(N)
| Deletion (Unordered Array)   | O(N)
| Deletion (Ordered Array)     | O(N)
