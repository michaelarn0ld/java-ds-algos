# Logarithms and Search in Ordered Arrays

What is the exact size of the maximum range that can be searched in n number of
steps?

| Number of Steps       | Maximum Range       | Range Expressed as 2^n
| -                     | -                   | -
| 0                     | 1                   | 2^0  
| 1                     | 2                   | 2^1  
| 2                     | 4                   | 2^2  
| 3                     | 8                   | 2^3  
| 4                     | 16                  | 2^4  
| 5                     | 32                  | 2^5  
| 6                     | 64                  | 2^6  
| 7                     | 128                 | 2^7  
| 8                     | 256                 | 2^8  
| 9                     | 512                 | 2^9  
| 10                    | 1024                | 2^10  

We can see above that:
`Range = 2^(Number of Steps)`

Rearranged, the formula for the maximum of steps becomes:
`Steps = LOG2(Range)`

Consider the case where the formula produces a non-integer number, such as when
the range is 100 elements. In this case, Steps = 6.644. In these cases, we round
up; a sorted array containing 100 elements would take at maximum 7 steps to
search.
