package week_7.palindrome;

import org.junit.jupiter.api.Test;
import week_7.palindrome.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome palindrome = new Palindrome();
    @Test
    void isPalindrome() {
        assertTrue(palindrome.isPalindrome("Madam"));
    }
}