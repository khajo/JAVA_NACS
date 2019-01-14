package week_7.palindrome;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public Boolean isPalindrome(String word) {
        word = word.replace(" ", "");
        String palindrome = getPalindrome(word);
        return word.equalsIgnoreCase(palindrome);
    }

    public String getPalindrome(String word) {
        List<String> letters = split(word);
        Collections.reverse(letters);
        String palindromeWord = String.join("",letters);
        return palindromeWord;
    }
    public List<String> split(String word) {
        String[] parts = word.split("");
        List<String> letters = Arrays.asList(parts);
        return letters;
    }

}
