package michaelarn0ld.ds_algorithms.arrays;

/**
 * This class implements an ordered array
 * */
public class OrderedArray implements Array {

    private final int[] a;
    private int nElems;

    public OrderedArray(int max) {
        a = new int[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    /**
     * Implements binary search to find index of an element in an ordered array
     *
     * @param value - value that we are looking for in the array
     * @return - the index of value if it exists, otherwise -1 if not found
     * */
    @Override
    public int find(int value) {

        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIdx;

        while(lowerBound <= upperBound) {
            curIdx = (lowerBound + upperBound) / 2;
            if(a[curIdx] == value){
                return curIdx; 
            } 
            if(value > a[curIdx]) {
                lowerBound = curIdx + 1;
            } else {
                upperBound = curIdx - 1;
            }
        }
        return -1;
    }

    /**
     * Uses linear search to find the insertion index, shifts all elements from
     * this index rightward (inclusive) to the right by one, then inserts the
     * value at the insertion index.
     *
     * @param value - value that we want to insert into the sorted array
     * */
    @Override
    public void insert(int value) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (a[i] > value) break;
        }
        for (int j = nElems; j > i; j--) {
            a[j] = a[j - 1];
        }
        a[i] = value;
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
