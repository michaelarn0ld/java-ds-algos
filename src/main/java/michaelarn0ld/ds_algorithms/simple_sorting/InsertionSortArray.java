package michaelarn0ld.ds_algorithms.simple_sorting;

public class InsertionSortArray implements SimpleSortingArray {

    private int[] array;
    private int nElems;

    public InsertionSortArray(int max) {
        array = new int[max];
        nElems = 0;
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

    /**
     * Implements Insertion Sort; elements only moved left once, once they are
     * left of index i they are partially sorted.
     * */
    @Override
    public void sort(){
        for (int i = 1; i < nElems; i++) {
            int tmp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > tmp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = tmp;
        }
    }

    /**
     * Remove duplicates, in place in O(N) time and O(1) space
     * */
    /*void removeDuplicates() {
        int i = 0;
        for (int j = 1; j < nElems; j++) {
            if (array[i] != array[j]) {
                i++;
                array[i] = array[j];
            }
        }
        nElems -= (nElems - ++i)
    }*/
}
