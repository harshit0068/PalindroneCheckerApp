/**
 * Use Case 11: Object-Oriented Palindrome Service
 * Description: Demonstrates encapsulation by moving logic to a Service class.
 * @author Harshit Singh
 * @version 11.0
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String input = "racecar"; // [cite: 379]

        // Instantiate the service object
        PalindromeService service = new PalindromeService();

        // Use the service to check the palindrome
        boolean isPalindrome = service.checkPalindrome(input);

        System.out.println("Input: " + input); // [cite: 379]
        System.out.println("Is Palindrome?: " + isPalindrome); // [cite: 380]
    }
}

/**
 * Service class that contains encapsulated palindrome logic.
 */
class PalindromeService {
    /**
     * Checks whether the input string is a palindrome.
     * @param input The string to check
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        int start = 0; // [cite: 373]
        int end = input.length() - 1; // [cite: 375]

        while (start < end) { // [cite: 376]
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}