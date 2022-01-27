package michaelarn0ld.ds_algorithms.arrays;

/**
 * This class implements an ordered array
 * */
public class OrderedArray implements Array {

    private final int[] array;
    private int nElems;

    public OrderedArray(int max) {
        array = new int[max];
        nElems = 0;
    }

    /**
     * Returns the size of the ordered array; does not include empty elements
     * in the extra space allocated at construction
     *
     * @return - number of filled elements in the array
     * */
    @Override
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
     * Implements binary search to find index of an element in an ordered array
     *
     * @param value - value that we are looking for in the array
     * @return - the index of value if it exists, otherwise -1 if not found
     * */
    @Override
    public int find(int value) {

        int left = 0;
        int right = nElems - 1;
        int mid;

        while(left <= right) {
            mid = (left + right) / 2;
            if(array[mid] == value){
                return mid; 
            } 
            if(value > array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Uses binary search to find the insertion index, shifts all elements from
     * this index rightward (inclusive) to the right by one, then inserts the
     * value at the insertion index.
     *
     * @param value - value that we want to insert into the sorted array
     * */
    @Override
    public void insert(int value) {

        int left = 0;
        int right = nElems - 1;
        int mid;

        while(left <= right) {
            mid = (left + right) / 2;
            if (value >= array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        for (int j = nElems; j > left; j--) {
            array[j] = array[j - 1];
        }
        array[left] = value;
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
     * Merges this array another ordered array into a new ordered array.
     *
     * @param mergeArray - ordered array to be merged
     * @return - a new ordered destination array
     * */
    @Override
    public Array merge(Array mergeArray) {

        OrderedArray arr = new OrderedArray((size() + mergeArray.size()) * 2);
        int i = 0, j = 0;

        while(i < size() && j < mergeArray.size()) {
            if (get(i) < mergeArray.get(j)) {
                arr.insert(get(i));
                i++;
            } else {
                arr.insert(mergeArray.get(j));
                j++;
            }
        }

        while (i < size()) {
            arr.insert(get(i));
            i++;
        }

        while (j < mergeArray.size()) {
            arr.insert(mergeArray.get(j));
            j++;
        }

        return arr;
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
