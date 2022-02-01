package michaelarn0ld.ds_algorithms.stacks_queues;

/**
 * A priority queue is a data srtucture in which elements are ordered by key value
 * so that the item with the lowest key is always at the front.
 *
 * The "front" of a priority queue here refers to index = nItems - 1
 * The "rear" of a priority queue here refers to index = 0
 * */
public class PriorityQueue {

    private int nItems;
    private final int[] priorityQueueArray;

    public PriorityQueue(int size) {
        priorityQueueArray = new int[size];
        nItems = 0;
    }

    /**
     * Inserts a value into its proper positions in the priorty queue; values
     * with lower key values are placed at the front of the queue.
     *
     * @param value - value to be inserted
     * */
    public void insert(int value) {
        if (isFull()) {
            return;
        }
        if (isEmpty()) {
            priorityQueueArray[nItems++] = value;
            return;
        } 
        int i = nItems - 1;
        while (i >= 0 && value > priorityQueueArray[i]) {
            priorityQueueArray[i + 1] = priorityQueueArray[i];
            i--;
        }
        priorityQueueArray[++i] = value;
        nItems++;
    }

    /**
     * Removes an item from the front of the queue
     *
     * @return - item at the front of the queue
     * */
    public Integer remove() {
        return isEmpty() ? null : priorityQueueArray[--nItems];
    }

    /**
     * Peeks the item at the front of the queue 
     *
     * @return - item at the front of the queue
     * */
    public Integer peek() {
        return isEmpty() ? null : priorityQueueArray[nItems - 1];
    }

    /**
     * Checks if the priority queue is full.
     *
     * @return - true if the priority queue is full
     * */
    public boolean isFull(){
        return nItems == priorityQueueArray.length;
    }

    /**
     * Checks if the priority queue is empty.
     *
     * @return - true if the priority queue is empty
     * */
    public boolean isEmpty(){
        return nItems == 0;
    }
}
