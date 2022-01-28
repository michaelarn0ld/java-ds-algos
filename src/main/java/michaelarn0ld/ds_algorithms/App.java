package michaelarn0ld.ds_algorithms;

import michaelarn0ld.ds_algorithms.simple_sorting.BubbleSortArray;
import michaelarn0ld.ds_algorithms.simple_sorting.SelectionSortArray;
import michaelarn0ld.ds_algorithms.simple_sorting.InsertionSortArray;
import michaelarn0ld.ds_algorithms.simple_sorting.EvenOddSortArray;

public class App {
    public static void main(String[] args) {
        InsertionSortArray arr = new InsertionSortArray(100);
        arr.insert(1);
        arr.insert(1);
        arr.insert(4);
        arr.insert(1);
        arr.insert(1);
        arr.insert(4);
        arr.insert(4);
        arr.insert(1);
        arr.insert(9);
        arr.insert(10);
        arr.display();
        arr.sort();
        arr.display();
    }
}
