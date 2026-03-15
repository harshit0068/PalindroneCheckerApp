/**
 * Use Case 3: Reverse String Based Palindrome Check
 * Description: Checks for palindrome by reversing the string.
 * @author Harshit Singh
 * @version 3.0
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        // Iterate from the last character to the first [cite: 670, 671]
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Building the reversed string [cite: 644]
        }

        // Compare content using equals() [cite: 645, 656]
        boolean isPalindrome = input.equals(reversed);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}