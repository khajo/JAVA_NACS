package week_11.ex_4;

import java.util.Arrays;
import java.util.List;

public class Remove {


    public Integer getLeftOverLetters(String word, String edited) {
        Integer counter = 0;
        for (int position = 0; position <edited.length() ; position++) {
            if (edited.charAt(position) != word.charAt(position) && edited.charAt(position) !=word.charAt(position+1)) {
                counter++;
            }


        }
        return counter;

    }


    public Boolean isValid(String word, String edited) {
        return  word.length() == edited.length() + 1 && getLeftOverLetters(word, edited) == 1;
    }
}
