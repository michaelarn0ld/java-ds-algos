# Queues
A queue is another data structure that is a lot like the line at a grocery store
or movie theater. At the movie theater, people are served in the order in which 
they get in line; the first person that gets in line is the first person who
gets their ticket. The order of a queue is then known as "FIFO", or the first 
item that goes in is the first item that comes out.

The fundamental operations of a queue are pretty similar to those of a stack;
You can insert to a queue, you can remove from a queue, and you can check both 
the peak the front and back elements of a queue. The difference, however, is in 
the order in which elements are enqueued (inserted) and dequeued (removed); 
enqueuing an element places it at the back and dequeuing removes the element at 
the front.

Like stacks, queues are useful in a variety of problems. For instance, a queue 
might be used to schedule the order in which items get processed by a printer.
Another type of problem that a queue excels in is the implementation of a 
breadth-first-search algorithm.

## Efficiency of Queues
As with a stack, items can be inserted and removed from a queue in O(1) time.
