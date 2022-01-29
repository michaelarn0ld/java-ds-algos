package michaelarn0ld.ds_algorithms.stacks_queues;
import java.lang.reflect.Array;

public class Stack<T> {

    private final T[] elements;
    private int top;

    public Stack(Class<T> clazz, int capacity) {
        elements = (T[]) Array.newInstance(clazz, capacity);
        top = -1;
    }

    /**
     * Checks if the stack is empty
     *
     * @return - true if empty
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Checks if the stack is at capacity
     *
     * @return - true if full
     */
    public boolean isFull() {
        return top == elements.length - 1;
    }

    /**
     * Gets the number of elements currently in the stack
     *
     * @return - number of elements in the stack
     */
    public int size() {
        return top + 1;
    }

    /**
     * Adds an element to the top of the stack
     *
     * @param value - element added to the stack
     */
    public void push(T value) {
        if (!isFull()) {
            elements[++top] = value;
        }
    }

    /**
     * Removes an element from the top of the stack
     *
     * @return - the element at the top of the stack
     */
    public T pop() {
        if (!isEmpty()) {
            return elements[top--];
        }
        return null;
    }

    /**
     * Looks at the element at the top of the stack without removing it
     *
     * @return - the element at the top of the stack
     */
    public T peek() {
        if (!isEmpty()) {
            return elements[top];
        }
        return null;
    }

}
