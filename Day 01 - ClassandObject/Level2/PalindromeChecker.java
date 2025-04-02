package ClassandObject.Level2;
import java.util.Scanner;

public class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversed);
    }
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        }
        else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text to check: ");
        String inputText = input.nextLine();
        PalindromeChecker checker = new PalindromeChecker(inputText);
        checker.displayResult();
        input.close();
    }
}
