package week_7.palindrome;

import week_7.palindrome.Palindrome;

public class PalindromeApplication {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("madam"));
        System.out.println(palindrome.isPalindrome("nurses run"));
    }
}
