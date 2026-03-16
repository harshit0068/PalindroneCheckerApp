import java.util.Stack;

/**
 * Use Case 13: Performance Comparison
 * Description: Measures and compares execution duration of algorithms[cite: 451, 453].
 * @author Harshit Singh
 * @version 13.0
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String input = "Level".toLowerCase(); // [cite: 468]

        // Using the Strategy Pattern from UC12
        PalindromeStrategy strategy = new StackStrategy();

        // Capture start time in nanoseconds
        long startTime = System.nanoTime();

        // Execute the algorithm [cite: 443]
        boolean isPalindrome = strategy.check(input);

        // Capture end time [cite: 456]
        long endTime = System.nanoTime();

        // Calculate total duration
        long duration = endTime - startTime;

        System.out.println("Input: " + input); // [cite: 468]
        System.out.println("Is Palindrome?: " + isPalindrome); // [cite: 469]
        System.out.println("Execution Time: " + duration + " ns"); // [cite: 470]
    }
}

// Reusing the interface and strategy from UC12
interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}