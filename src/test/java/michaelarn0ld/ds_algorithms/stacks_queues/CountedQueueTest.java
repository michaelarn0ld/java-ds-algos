package michaelarn0ld.ds_algorithms.stacks_queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountedQueueTest {

    @Test
    void shouldAdd() {
        CountedQueue<Integer> queue = new CountedQueue<>(Integer.class, 10);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        assertTrue(queue.size() == 5);
    }

    @Test
    void shouldBeFifo() {
        CountedQueue<Integer> queue = new CountedQueue<>(Integer.class, 10);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        assertEquals(1, queue.remove());
        assertEquals(2, queue.remove());
    }

    @Test
    void shouldNotAddToFullQueue() {
        CountedQueue<Integer> queue = new CountedQueue<>(Integer.class, 3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        assertTrue(queue.size() == 3);
    }

}