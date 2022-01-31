package michaelarn0ld.ds_algorithms.stacks_queues;

import java.lang.reflect.Array;

public class CountedQueue<T> implements Queue<T> {

    private final T[] elements;
    private int front;
    private int rear;
    private int nItems;

    public CountedQueue(Class<T> clazz, int capacity) {
        elements = (T[]) Array.newInstance(clazz, capacity);
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /**
     * Checks if the queue is empty
     *
     * @return - true if the queue is empty
     */
    @Override
    public boolean isEmpty() {
        return nItems == 0;
    }

    /**
     * Checks if the queue is at capacity
     *
     * @return - true if the queue is at capacity
     */
    @Override
    public boolean isFull() {
        return nItems == elements.length;
    }

    /**
     * Checks the size of the queue
     *
     * @return - the number of elements currently enqueued
     */
    @Override
    public int size() {
        return nItems;
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
        nItems++;
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
        nItems--;
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
