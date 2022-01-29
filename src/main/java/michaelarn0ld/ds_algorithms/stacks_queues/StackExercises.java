package michaelarn0ld.ds_algorithms.stacks_queues;

/*
Exercises that show a few good uses for stacks
 */
public class StackExercises {

    /**
     * Reverses a string using a stack
     * @param input - string to be reversed
     * @return - the reversed string
     */
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>(Character.class, input.length());
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder output = new StringBuilder();
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.toString();
    }


    /**
     * Validates if brackets (), {}, [] are properly closed within a string
     * @param input - string containing brackets to check
     * @return - true if all brackets are properly closed
     */
    public static boolean checkBrackets(String input) {
        Stack<Character> stack = new Stack<>(Character.class, input.length());
        for (char c : input.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                case ']':
                case ')':
                    Character top = stack.peek();
                    if (top != null
                        && c == '}' && top == '{'
                        || c == ']' && top == '['
                        || c == ')' && top == '(') {
                        stack.pop();
                        break;
                    }
                    return false;
            }
        }
        return true;
    }
}
