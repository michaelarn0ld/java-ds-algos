package michaelarn0ld.ds_algorithms.stacks_queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueTest {

    @Test
    void shouldBehaveLikePriorityQueue() {
        PriorityQueue priorityQueue = new PriorityQueue(100);
        priorityQueue.insert(100);
        priorityQueue.insert(10);
        priorityQueue.insert(70);
        priorityQueue.insert(1);
        priorityQueue.insert(6);
        priorityQueue.insert(1003);
        priorityQueue.insert(20);
        // should be [1003, 100, 70, 20, 10, 6, 1]

        assertEquals(1, priorityQueue.remove());
        assertEquals(6, priorityQueue.remove());
        assertEquals(10, priorityQueue.remove());
        assertEquals(20, priorityQueue.remove());
        assertEquals(70, priorityQueue.remove());
        assertEquals(100, priorityQueue.remove());
        assertEquals(1003, priorityQueue.remove());

        // should return null when trying to remove from an empty queue
        assertEquals(null, priorityQueue.remove());
    }
}