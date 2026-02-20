/**
 * ======================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ======================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "madam";


        String reverse = "";


        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }


        if (input.equals(reverse)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}