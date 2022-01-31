package michaelarn0ld.ds_algorithms.stacks_queues;

import java.lang.reflect.Array;

public class UncountedQueue<T> implements Queue<T> {
    private final T[] elements;
    private int front;
    private int rear;

    public UncountedQueue(Class<T> clazz, int capacity) {
        elements = (T[]) Array.newInstance(clazz, capacity + 1);
        front = 0;
        rear = -1;
    }

    /**
     * Checks if the queue is empty
     *
     * @return - true if the queue is empty
     * --------------------------------------------------------
     * [-,-,-,_]
     *      R F
     *  F = 3; R = 2; R + 1 = F -> Empty
     *  -------------------------------------------------------
     * [_,-,-,-]
     *  F      R
     *  F = 0; R = 3; F + length - 1 = R -> Empty
     *  -------------------------------------------------------
     */
    @Override
    public boolean isEmpty() {
        return rear + 1 == front || front + elements.length - 1 == rear;
    }

    /**
     * Checks if the queue is at capacity
     *
     * @return - true if the queue is at capacity
     * --------------------------------------------------------
     * [1,2,3,4,5,_]
     *  F       R
     *  F = 0; R = 4; length = 6; F + length - 2 = R -> Full
     *  -------------------------------------------------------
     *  [7,_3,4,5,6]
     *   R  F
     *  F = 2; R = 0; R + 2 = F -> Full
     *  -------------------------------------------------------
     */
    @Override
    public boolean isFull() {
        return front + elements.length - 2 == rear|| rear + 2 == front;
    }

    /**
     * Checks the size of the queue
     *
     * @return - the number of elements currently enqueued
     */
    @Override
    public int size() {
        if (rear >= front) {
            return rear - front + 1;
        }
        return elements.length - front + rear + 1;
    }

    /**
     * Adds an element to the back of the queue
     *
     * @param value - element to be enqueued
     */
    @Override
    public void insert(T value) {
        if (isFull()) {
            return;
        }
        if (rear >= elements.length - 1) {
            rear = -1;
        }
        elements[++rear] = value;
    }

    /**
     * Removes an element from the front of the queue
     *
     * @return - the element that was just dequeued
     */
    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T item = elements[front++];
        if (front >= elements.length) {
            front = 0;
        }
        return item;
    }

    /**
     * Look at the element at the front of the queue without removing it
     *
     * @return - the element at the front of the queue
     */
    @Override
    public T peek() {
        return !isEmpty() ? elements[front] : null;
    }

}
