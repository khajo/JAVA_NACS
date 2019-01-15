package week_9.ex_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Caesar {

    public String caesar(String plaintext, Integer key) {

        return getStringStream(plaintext, key);
    }


    public String getStringStream(String plaintext, Integer key) {
        List<String> splited = Arrays.asList(plaintext.split(""));

        return splited.stream()
                .map(e -> isAlphapet(e, key))
                .collect(Collectors.joining());
    }

    private String isAlphapet(String letter, Integer key) {
        Integer num = (int) letter.toLowerCase().charAt(0);
        if (Character.isAlphabetic(num)) {
            return isRight(letter, getNextLetter(letter, key));
        }
        return letter;
    }


    public String isRight(String expected, String letter) {

        if (expected.equals(expected.toLowerCase())) {
            return letter.toLowerCase();
        }

        return letter.toUpperCase();
    }

    public String getNextLetter(String letter, Integer key) {
        List<String> letters = Arrays.asList(letter);
        String collect = letters.stream()
                .map(e -> e.toLowerCase())
                .map(e -> (int) e.charAt(0))
                .filter(e -> e > 97 && e < 122)
                .map(e -> e + key)
                .map(e -> letterLogic(e))
                .map(e -> Character.toString((char) (int) e))
                .collect(Collectors.joining());
        return collect;
    }


    private Integer letterLogic(Integer number) {
        if (number > 122) {
            return (number % 122) + 96;
        }
        return number;
    }

}
