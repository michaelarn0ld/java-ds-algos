package michaelarn0ld.ds_algorithms.linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkTest {

    @Test
    void shouldGetLink() {
        Link<Integer> integerLink = new Link<>(1);
        assertEquals(1, integerLink.getData());
    }

    @Test
    void shouldGetDeepLink() {
        Link<Integer> linkOne = new Link<>(2);
        Link<Integer> linkTwo = new Link<>(3);
        Link<Integer> linkThree = new Link<>(4);

        linkTwo.setNext(linkThree);
        linkOne.setNext(linkTwo);

        assertEquals(linkOne.getNext().getNext().getData(), 4);
    }

    @Test
    void nextShouldBeNull() {
        Link<Integer> integerLink = new Link<>(1);
        assertNull(integerLink.getNext());
    }
}
