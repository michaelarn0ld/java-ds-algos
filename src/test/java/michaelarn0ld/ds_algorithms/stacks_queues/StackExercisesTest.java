package michaelarn0ld.ds_algorithms.stacks_queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackExercisesTest {

    @Test
    void shouldReverseString() {
        String reversed = StackExercises.reverseString("Cat in the hat");
        assertEquals("tah eht ni taC", reversed);
    }

    @Test
    void shouldHandleEmptyString() {
        String reversed = StackExercises.reverseString("");
        assertEquals("", reversed);
    }

    @Test
    void shouldCheckGoodBrackets() {
        String input = "This [is] a {good (string)}";
        boolean checkBrackets = StackExercises.checkBrackets(input);
        assertTrue(checkBrackets);
    }

    @Test
    void shouldCheckBadBrackets() {
        String input = "This is []} a bad (]}( string";
        boolean checkBrackets = StackExercises.checkBrackets(input);
        assertFalse(checkBrackets);
    }

}