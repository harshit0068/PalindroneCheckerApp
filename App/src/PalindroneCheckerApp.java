/**
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 * Description: Validates palindrome after removing spaces and normalizing case. [cite: 311, 313]
 * @author Harshit Singh
 * @version 10.0 [cite: 321]
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        // Example input with mixed case and spaces [cite: 319, 336]
        String input = "A man a plan a canal Panama";

        // Step 1: Normalize - Remove spaces/symbols and convert to lowercase [cite: 314, 315, 316]
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); [cite: 306]

        boolean isPalindrome = true; [cite: 329]

        // Step 2: Symmetric Comparison [cite: 332]
        for (int i = 0; i < normalized.length() / 2; i++) { [cite: 330]
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) { [cite: 333]
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Display results [cite: 335]
        System.out.println("Input: " + input); [cite: 336]
        System.out.println("Normalized: " + normalized);
        System.out.println("Is Palindrome?: " + isPalindrome); [cite: 337]
    }
}