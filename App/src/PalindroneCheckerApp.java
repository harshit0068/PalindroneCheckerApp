/**
 * Use Case 9: Recursive Palindrome Checker
 * Description: Validates palindrome using recursion and the method call stack. [cite: 270, 272]
 * @author Harshit Singh
 * @version 9.0 [cite: 280]
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String input = "madam"; // [cite: 296]

        // Initial call to recursive method [cite: 284]
        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Input: " + input); // [cite: 296]
        System.out.println("Is Palindrome?: " + isPalindrome); // [cite: 297]
    }

    /**
     * Recursive method to compare characters moving inward.
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition: If pointers cross, all characters matched [cite: 262, 265, 274]
        if (start >= end) {
            return true;
        }

        // Check if characters at current positions match [cite: 273]
        if (s.charAt(start) != s.charAt(end)) {
            return false; // Mismatch found [cite: 276]
        }

        // Recursive call for the inner substring [cite: 261, 264]
        return check(s, start + 1, end - 1);
    }
}