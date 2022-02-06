package michaelarn0ld.ds_algorithms.linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleEndedLinkedListTest {

    @Test
    void shouldPrintDoubleEndedList() {
        DoubleEndedLinkedList<Integer> list = new DoubleEndedLinkedList<>();
        list.insertHead(3);
        list.insertHead(2);
        list.insertHead(1);
        list.insertTail(4);
        list.insertTail(5);
        list.display();
    }

    @Test
    void shouldDelete() {
        DoubleEndedLinkedList<Integer> list = new DoubleEndedLinkedList<>();
        list.insertHead(3);
        list.insertHead(2);
        list.insertHead(1);
        list.insertTail(4);
        list.insertTail(5);

        list.display();
        Link<Integer> delete = list.deleteHead();
        list.display();
        assertEquals(1, delete.getData());
    }

}