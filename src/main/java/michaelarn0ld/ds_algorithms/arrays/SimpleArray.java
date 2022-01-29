package michaelarn0ld.ds_algorithms.arrays;

public interface SimpleArray {

    int size();

    Integer get(int i);

    int find(int value);

    void insert(int value);

    boolean delete(int value);

    void display();

    SimpleArray merge(SimpleArray mergeSimpleArray);
}
