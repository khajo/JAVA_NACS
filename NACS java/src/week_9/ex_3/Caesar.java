package week_9.ex_3;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Caesar {

    public String encrypt(String plaintext, Integer key) {
        return Stream.of(plaintext.split(""))
                .map(e -> encryptLetter(e, key))
                .collect(Collectors.joining());
    }

    private String encryptLetter(String letter, Integer key) {
        Integer num = (int) letter.charAt(0);
        if (!Character.isAlphabetic(num)) {
            return letter;
        }
        return shift(num, key);
    }

    private String shift(Integer number, Integer key) {
        boolean wasUppercase = Character.isUpperCase(number);
        number = Character.toLowerCase(number);
        number += key;
        if (number > 122) {
            number = (number % 122) + 96;
        }
        if (wasUppercase) {
            number = Character.toUpperCase(number);
        }
        return Character.toString((char) number.intValue());
    }



}
