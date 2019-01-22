package codeWars;

import java.util.Arrays;
import java.util.List;

public class DoublicatedLetter {
    public static void main(String[] args) {

        System.out.println(getNewWord("Mustafa"));
        System.out.println(getNewWord("((  @"));
        System.out.println(getNewWord("Pin"));
        System.out.println(checkLetter("a", Arrays.asList("a", "b", "v", "A")));

    }

    public static String getNewWord(String word) {
        String newWord = "";
        List<String> splited = Arrays.asList(word.split(""));
        for (String letter : splited) {
            if (checkLetter(letter, splited)) {
                newWord = newWord + ")";
            } else {
                newWord = newWord + "(";

            }

        }

        return newWord ;
    }

    private static boolean checkLetter(String letter, List<String> splited) {
        Integer counter = 0;
        for (int position = 0; position < splited.size(); position++) {
            if (letter.equalsIgnoreCase(splited.get(position))) {
                counter += 1;
            }
        }

        return counter > 1;

    }


}
