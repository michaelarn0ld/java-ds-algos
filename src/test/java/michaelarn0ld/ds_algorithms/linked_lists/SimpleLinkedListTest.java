package michaelarn0ld.ds_algorithms.linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLinkedListTest {

    @Test
    void shouldPrintList() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList();
        list.insertHead(5);
        list.insertHead(4);
        list.insertHead(3);
        list.insertHead(2);
        list.insertHead(1);
        list.display();
    }

    @Test
    void shouldDelete() {

        SimpleLinkedList<Integer> list = new SimpleLinkedList();
        list.insertHead(0);
        list.insertHead(1);
        list.insertHead(2);
        list.insertHead(3);
        list.insertHead(4);
        list.display();

        Link delete = list.delete(3);
        list.display();
        assertEquals(delete.getData(), 1);
    }

}