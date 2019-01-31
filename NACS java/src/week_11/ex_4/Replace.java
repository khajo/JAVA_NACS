package week_11.ex_4;

import java.util.Arrays;
import java.util.List;

public class Replace implements Edit {
    @Override
    public Integer getLeftOverLetters(String word, String edited) {

        Integer counter = 0;

        for (int position = 0; position <word.length() ; position++) {

            if (word.charAt(position) != edited.charAt(position)) {
                counter++;
            }
        }


        return counter;

    }

    @Override
    public Boolean isValid(String word, String edited) {
        return word.length() == edited.length() + 1 && getLeftOverLetters(word, edited)== 1;
    }
}

