package michaelarn0ld.ds_algorithms.linked_lists;

import java.time.chrono.IsoChronology;

public class DoubleEndedLinkedList<T> {
    private Link head;
    private Link tail;

    /**
     * Checks if the list is empty
     *
     * @return - true if the list is empty
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Inserts a link at the head of the linked list
     *
     * @param value - link to be inserted at the head
     */
    public void insertHead(T value) {
        Link<T> link = new Link<>(value);
        if (isEmpty()) {
            tail = link;
        }
        link.setNext(head);
        head = link;
    }

    /**
     * Inserts a link at the tail of the linked list
     * @param value - link to be inserted at the tail
     */
    public void insertTail(T value) {
        Link<T> link = new Link<>(value);
        if (isEmpty()) {
            head = link;
        } else {
            tail.setNext(link);
        }
        tail = link;
    }

    /**
     * Deletes the current head of the link, if there is a head
     *
     * @return - the head that we just deleted
     */
    public Link deleteHead() {
        if (isEmpty()) {
            return null;
        }
        Link tmp = head;
        head = head.getNext();
        return tmp;
    }

    /**
     * Displays the content of the linked list
     */
    public void display() {
        System.out.print("List (head --> tail): ");
        Link current = head;
        while (current != null) {
            current.display();
            current = current.getNext();
        }
        System.out.println();
    }
}
