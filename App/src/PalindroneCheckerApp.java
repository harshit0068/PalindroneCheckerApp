/**
 * Use Case 4: Character Array Based Palindrome Check
 * Description: Validates palindrome using char array and two-pointer technique.
 * @author Harshit Singh
 * @version 4.0
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        // Initialize input string [cite: 707, 708]
        String input = "radar";

        // Convert string to character array [cite: 709, 710]
        char[] chars = input.toCharArray();

        // Initialize start and end pointers [cite: 711, 713]
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true; // [cite: 715]

        // Compare characters until pointers cross [cite: 716]
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input: " + input); // [cite: 718]
        System.out.println("Is Palindrome?: " + isPalindrome); // [cite: 719]
    }
}