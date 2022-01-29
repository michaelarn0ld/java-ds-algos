# Stacks
Like the name implies, a stack is simply a stack of things; In this structure, 
items can only be added or removed from the top. The order of a stack is known as
"LIFO", or the last item that goes in is the first item that comes out.

Imagine you are grading papers, every time you finish one you place the paper
into a neat pile on your desk. When you get up and look at those papers, the first
one you will see is the last you finished grading. Similarly, if you grade another
new paper and place it in the pile, it is now at the top of the pile. Stacks are
just like this.

In a stack, the three fundamental operations are peek, push, and pop. Calling "peek"
on a stack allows you to examine the top item but does not remove it. When you "push"
an item to a stack, you place it at the top. When you "pop" from a stack, you remove
the top item.


## Efficiency of Stacks
Items can be pushed and popped from a stack in constant O(1) time. It is not time
dependent on how many items are in the stack and is therefore very quick.