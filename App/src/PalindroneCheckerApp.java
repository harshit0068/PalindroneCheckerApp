import java.util.Stack;

/**

 * Use Case 5: Stack-Based Palindrome Checker
 * Description: Validates palindrome using the LIFO behavior of a Stack.
 * @author Harshit Singh
 * @version 5.0
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String input = "noon"; // [cite: 769]
        Stack<Character> stack = new Stack<>(); //

        // Step 1: Push characters into stack [cite: 742, 758]
        for (char c : input.toCharArray()) {
            stack.push(c); // [cite: 747, 773]
        }

        boolean isPalindrome = true; // [cite: 774]

        // Step 2: Pop and compare with original sequence [cite: 743, 759, 760]
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) { // [cite: 748, 776, 777]
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Print result [cite: 744]
        System.out.println("Input: " + input); // [cite: 780]
        System.out.println("Is Palindrome?: " + isPalindrome); // [cite: 781]

    }
}