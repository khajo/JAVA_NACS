package codeWars;

import java.util.Arrays;
import java.util.List;

public class Troll {
    public static void main(String[] args) {
        String removedVowels = disemvowel("This website is for losers LOL!");
        System.out.println(removedVowels);
    }

    public static String disemvowel(String word) {
        List<String> vowlesLetters = Arrays.asList("i", "a", "e", "o", "u");
        for (String vowlesLetter : vowlesLetters) {
            word = word.replace(vowlesLetter, "");

        }
        return word;
    }


}

