package michaelarn0ld.ds_algorithms.simple_sorting;

public class SelectionSortArray implements SimpleSortingArray {

    private int[] array;
    private int nElems;

    public SelectionSortArray(int max) {
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
     * Implements Selection Sort; the minimum element is selected and a swap 
     * occurs only once during each pass; elements to the left of i are fully
     * sorted.
     * */
    @Override
    public void sort(){
        int min, tmp;
        for (int i = 0; i < nElems; i++) {
            min = i;
            for (int j = i + 1; j < nElems; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
    }

}
