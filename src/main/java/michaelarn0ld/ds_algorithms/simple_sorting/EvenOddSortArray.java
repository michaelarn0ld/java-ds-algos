package michaelarn0ld.ds_algorithms.simple_sorting;

public class EvenOddSortArray implements SimpleSortingArray {

    private int[] array;
    private int nElems;

    public EvenOddSortArray(int max) {
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
     * Implements Even Odd Sort.
     * */
    @Override
    public void sort(){
        for (int i = 0; i < nElems; i++) {
            // even index pass
            for (int j = 0; j < nElems - 1; j += 2) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            // odd index pass
            for (int k = 1; k < nElems - 1; k += 2) {
                if (array[k] > array[k + 1]) {
                    int tmp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = tmp;
                }
            }
        }
    }

}
