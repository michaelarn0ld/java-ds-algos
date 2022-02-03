package michaelarn0ld.ds_algorithms.linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLinkedListTest {

    @Test
    void shouldPrintList() {
        Link<Integer> head = new Link<>(0);
        Link<Integer> nodeOne = new Link<>(1);
        Link<Integer> nodeTwo = new Link<>(2);
        Link<Integer> nodeThree = new Link<>(3);
        Link<Integer> nodeFour = new Link<>(4);

        SimpleLinkedList list = new SimpleLinkedList();
        list.insertHead(nodeFour);
        list.insertHead(nodeThree);
        list.insertHead(nodeTwo);
        list.insertHead(nodeOne);
        list.insertHead(head);
        list.display();
    }

    @Test
    void shouldDelete() {
        Link<Integer> head = new Link<>(0);
        Link<Integer> nodeOne = new Link<>(1);
        Link<Integer> nodeTwo = new Link<>(2);
        Link<Integer> nodeThree = new Link<>(3);
        Link<Integer> nodeFour = new Link<>(4);

        SimpleLinkedList list = new SimpleLinkedList();
        list.insertHead(nodeFour);
        list.insertHead(nodeThree);
        list.insertHead(nodeTwo);
        list.insertHead(nodeOne);
        list.insertHead(head);
        list.display();

        list.delete(3);
        Link deleted = list.delete(0);
        list.display();

        assertEquals(deleted.getData(), 0);

    }

}