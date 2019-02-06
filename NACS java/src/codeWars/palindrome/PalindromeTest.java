package codeWars.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();
    @Test
    void testIsPalindrome() {
        Boolean isPaladrome = palindrome.isPalindrome("taco cat");
        Assertions.assertTrue(isPaladrome);
        System.out.println(isPaladrome);
    }   @Test
    void testIsNotPalindrome() {
        Boolean isPaladrome = palindrome.isPalindrome("pop POPi");
        Assertions.assertFalse(isPaladrome);
        System.out.println(isPaladrome);
    }
}