import java.util.Stack;

/**
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * Description: Dynamically selects algorithms at runtime using the Strategy Design Pattern.
 * @author Harshit Singh
 * @version 12.0
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String input = "Level".toLowerCase(); // Normalizing for case sensitivity [cite: 436]

        // Injecting the Stack-based strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the selected algorithm
        boolean isPalindrome = strategy.check(input);

        System.out.println("Input: " + input); [cite: 436]
        System.out.println("Is Palindrome?: " + isPalindrome); [cite: 437]
    }
}

/**
 * Interface defining a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input); [cite: 386, 416]
}

/**
 * Concrete strategy implementing Stack-based palindrome validation.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>(); [cite: 430]

        // Push characters onto stack [cite: 432]
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping from stack [cite: 434]
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}