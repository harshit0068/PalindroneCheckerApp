import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Use Case 7: Deque Based Optimized Palindrome Checker
 * Description: Validates a palindrome using a Double Ended Queue (Deque).
 * @author Harshit Singh
 * @version 7.0
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        // Define the input string [cite: 866, 867]
        String input = "refer";

        // Create a Deque to store characters [cite: 868, 869]
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque [cite: 870, 871]
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result [cite: 873, 874]
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists [cite: 875, 876]
        while (deque.size() > 1) {
            // Remove first and last characters and compare [cite: 852, 853, 854]
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Display results [cite: 878, 879]
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}