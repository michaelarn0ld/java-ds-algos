package michaelarn0ld.ds_algorithms.stacks_queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void shouldAdd() {
        Stack<Character> charStack = new Stack<>(Character.class, 50);
        charStack.push('c');
        assertEquals('c', charStack.peek());
    }

    @Test
    void shouldBeLifo() {
        Stack<Character> charStack = new Stack<>(Character.class, 50);
        charStack.push('c');
        charStack.push('a');
        charStack.push('t');
        assertEquals('t', charStack.peek());
    }

    @Test
    void shouldNotAddToFullStack() {
        Stack<Character> charStack = new Stack<>(Character.class, 1);
        charStack.push('c');
        charStack.push('a');
        charStack.push('t');
        assertEquals(1, charStack.size());
    }

}