package michaelarn0ld.ds_algorithms.linked_lists;

/**
 * A LinkedList is composed of zero or more Links
 * */
public class Link<T> {

    private T data;
    private Link<T> next;

    public Link(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Link<T> getNext() {
        return next;
    }

    public void setNext(Link<T> next) {
        this.next = next;
    }

    /**
     * Displays the contents of the Link
     * */
    public void display() {
        System.out.printf("%s --> ", data);
    }

}
