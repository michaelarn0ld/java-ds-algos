package michaelarn0ld.ds_algorithms.arrays;

/**
 * This class implements an unordered array
 * */
public class UnorderedArray implements Array {

    private final int[] array;
    private int nElems;

    public UnorderedArray(int max) {
        array = new int[max];
        nElems = 0;
    }

    /**
     * Returns the size of the ordered array; does not include empty elements
     * in the extra space allocated at construction
     * */
    public int size() {
        return nElems;
    }

    /**
     * Returns the element at the specified index
     *
     * @param i - index of element
     * @return - value of the element, if it exists
     */
    @Override
    public Integer get(int i) {
        if (i < 0 || i > nElems - 1) {
            return null;
        }
        return array[i];
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
            if (array[i] == value) {
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
        array[nElems] = value;
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
                array[j] = array[j + 1];
            }
            nElems--;
            return true;
        }
        return false;
    }

    /**
     * Will implemented unordered array merge at a later time.
     * */
    @Override
    public Array merge(Array mergeArray) {
        return null;
    }

    /**
     * Displays the sorted array
     * */
    @Override
    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]\n");
    }
}
