# Ordered Arrays

* A major advantage of using ordered arrays is that search times are dramatically
faster than in an unordered array

* A disadvantage of using an ordered array is that insertion takes longer because
all elements with higher key values than the insertion must be shifted right to
make room for the new element


# When to Use an Ordered Array

* Ordered arrays are useful in situations where searches are frequent, but
insertion and deletion are infrequent

* (EX) A database of employees may be an appropriate candidate for an ordered
array; Hiring/firing of employee would most likely be relatively infrequent
when compared with accessing an existing employee's record.

* (EX) An inventory for a retail store would be a poor candidate for an ordered
array; frequent insertions and deletions of products, as items were bought and
sold, would hinder runtime.


## Why Not Use Arrays for Everything?

* In an unordered array, you can insert items quickly, in O(1) time, but
searching is slow and takes O(N). In an ordered array, you can search quickly in
O(LOG N) time, but insertion is slow at O(N) time.

* Another issue with arrays is that their size is fixed when they are created;
other data structures are flexible and can expand to the required size.

* Other data structures provide various pros and cons when compared to arrays.
It is important to have an understanding on what data structures to use and when
to use them. Consider the most common operations that they will be used for and
select the candidate that best suits your needs.
