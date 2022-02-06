package michaelarn0ld.ds_algorithms.linked_lists;

/**
 * Simplest version of a linked list, links only go in a single direction
 */
public class SimpleLinkedList<T> {
    private Link<T> head;

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
        link.setNext(head);
        head = link;
    }

    /**
     * Deletes the current head of the link, if there is a head
     *
     * @return - the head that we just deleted
     */
    public Link<T> deleteHead() {
        if (isEmpty()) {
            return null;
        }
        Link<T> tmp = head;
        head = head.getNext();
        return tmp;
    }

    /**
     * Finds a Link at the ith (0-based) index, if it exists
     *
     * @param i - "index" of the linked list that we want to find
     * @return - the element at that index if it exists, otherwise null
     */
    public Link find(int i) {
        int j = 0;
        Link current = head;
        while (j < i && current != null) {
            current = current.getNext();
            j++;
        }
        return current;
    }

    /**
     * Deletes a Link at the ith (0-based) index, if it exists
     *
     * @param i - "index" of the linked list that we want to delete
     * @return - the element we deleted, otherwise deletion failed and return null
     */
    public Link<T> delete(int i) {
        int j = 0;
        if (isEmpty()) {
            return null; // cannot delete from an empty list
        }
        if (i == 0) {
            return deleteHead();
        }
        Link<T> previous = head, current = head;
        while(j < i && current != null) {
            previous = current;
            current = current.getNext();
            j++;
        }
        if (current == null) {
            return null; // we went out of the list bounds; I.E. delete(4) on 0 --> 1 --> 2 --> 3 --> NULL
        }
        previous.setNext(current.getNext());
        return current;
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
