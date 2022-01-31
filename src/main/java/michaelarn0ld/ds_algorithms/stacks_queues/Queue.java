package michaelarn0ld.ds_algorithms.stacks_queues;

public interface Queue<T> {
    
    void insert(T value);

    T remove();

    T peek();

    boolean isEmpty();

    boolean isFull();

    int size();
}
