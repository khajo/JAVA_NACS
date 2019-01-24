package week_7.ex9;

import java.util.Arrays;
import java.util.List;


public class ReaderFilter {

    public String filter(String word) {
        List<String> letters = Arrays.asList(word.split(""));
        for (String letter : letters) {
            Integer asciNumber = (int) letter.charAt(0);
            if (!Character.isAlphabetic(asciNumber) || !letter.equals("'")) {
                letters.remove(letter);
            }

        }
        String checkedWord = String.join("", letters);



        return checkedWord;
    }

}
