import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Use Case 6: Queue + Stack Based Palindrome Check
 * Description: Validates palindrome by comparing FIFO (Queue) and LIFO (Stack) behaviors.
 * @author Harshit Singh
 * @version 6.0
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        // Define input string [cite: 820]
        String input = "civic";

        // Create Queue (FIFO) and Stack (LIFO) [cite: 821, 822, 823]
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures [cite: 787, 788, 824]
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue
            stack.push(c); // Push
        }

        boolean isPalindrome = true; // [cite: 826]

        // Compare dequeue vs pop until queue is empty [cite: 789, 827, 828]
        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result [cite: 830, 831]
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}