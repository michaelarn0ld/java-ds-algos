package michaelarnold.ds_algorithms.arrays;

/**
 * This class implements an ordered array
 * */
public class OrderedArray {

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
    public int find(int value) {

        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIdx;

        while(true) {
            curIdx = (lowerBound + upperBound) / 2;
            if(a[curIdx] == value){
                return curIdx; 
            } 
            if (lowerBound > upperBound) {
                return -1;
            }
            if(value > a[lowerBound]) {
                lowerBound = curIdx + 1;
            } else {
                upperBound = curIdx - 1;
            }
        }
    }

    public void insert(int value) {
    }
}
