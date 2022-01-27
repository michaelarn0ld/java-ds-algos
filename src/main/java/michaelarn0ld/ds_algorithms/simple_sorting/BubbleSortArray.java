package michaelarn0ld.ds_algorithms.simple_sorting;

public class BubbleSortArray implements SimpleSortingArray {

    private int[] array;
    private int nElems;

    public BubbleSortArray(int max) {
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
     * Implements Bubble Sort; "bigger" elements are "bubbled" to the end to end
     * of the array with each inner pass
     * */
    @Override
    public void sort(){
        for (int i = nElems - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

}
