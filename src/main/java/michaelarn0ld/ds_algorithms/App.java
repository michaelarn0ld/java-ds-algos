package michaelarn0ld.ds_algorithms;

import michaelarn0ld.ds_algorithms.simple_sorting.BubbleSortArray;
import michaelarn0ld.ds_algorithms.simple_sorting.SelectionSortArray;

public class App {
    public static void main(String[] args) {
        SelectionSortArray arr = new SelectionSortArray(100);
        arr.insert(11);
        arr.insert(1);
        arr.insert(4);
        arr.insert(31);
        arr.insert(19);
        arr.insert(45);
        arr.insert(1);
        arr.insert(12);
        arr.insert(9);
        arr.insert(10);
        arr.display();
        arr.sort();
        arr.display();
    }
}
