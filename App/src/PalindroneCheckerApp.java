import java.util.LinkedList;

/**
 * Use Case 8: Linked List Based Palindrome Checker
 * Description: Validates palindrome using LinkedList double-ended operations.
 * @author Harshit Singh
 * @version 8.0
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        // Define the input string [cite: 243, 244]
        String input = "level";

        // Create a LinkedList to store characters [cite: 245, 246]
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list [cite: 247, 248]
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state [cite: 250, 251]
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain [cite: 252, 253]
        while (list.size() > 1) {
            // Remove from both ends and compare [cite: 228, 229, 230]
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Display the results [cite: 254, 255, 256]
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}