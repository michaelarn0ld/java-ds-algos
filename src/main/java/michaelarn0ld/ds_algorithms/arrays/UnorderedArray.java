package michaelarn0ld.ds_algorithms.arrays;

/**
 * This class implements an unordered array
 * */
public class UnorderedArray implements Array {

    private final int[] a;
    private int nElems;

    public UnorderedArray(int max) {
        a = new int[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    /**
     * Implements linear search to find index of an element in an unordered array
     *
     * @param value - value that we are looking for in the array
     * @return - the index of value if it exists, otherwise -1 if not found
     * */
    @Override
    public int find(int value) {
        for (int i = 0; i < nElems; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Constant time insertion; insert new elements to the end of the array
     *
     * @param value - value that we want to insert into the unordered array
     * */
    @Override
    public void insert(int value) {
        a[nElems] = value;
        nElems++;
    }

    /**
     * Finds the index of the element if it exists and then shifts all elements
     * from that index rightward (inclusive) to the left by one.
     *
     * @param value - value that we want to remove from the array
     * @return - true if delete success else false if value is not in the array
     * */
    @Override
    public boolean delete(int value) {
        int i = find(value);
        if (i != -1) {
            for (int j = i; j < nElems; j++) {
                a[j] = a[j + 1];
            }
            nElems--;
            return true;
        }
        return false;
    }

    /**
     * Displays the sorted array
     * */
    @Override
    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]\n");
    }
}
