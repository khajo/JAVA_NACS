package codeWars.palindrome;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {

    public  Boolean isPalindrome(String word) {
        return word.length() > 1 && isEqual(word);
    }

    public  boolean isEqual(String word) {
        word = word.replaceAll(" ", "");
        String receivedWord = getReceivedWord(word);
        return word.equalsIgnoreCase(receivedWord);
    }

    public  String getReceivedWord(String word) {
        List<String> letters = Arrays.asList(word.split(""));
        Collections.reverse(letters);
        return letters.stream().collect(Collectors.joining());
    }


}
