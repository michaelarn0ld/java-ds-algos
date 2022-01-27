package michaelarn0ld.ds_algorithms.arrays;

public interface Array {

    int size();

    Integer get(int i);

    int find(int value);

    void insert(int value);

    boolean delete(int value);

    void display();

    Array merge(Array mergeArray);
}
