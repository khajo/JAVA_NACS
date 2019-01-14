package week_8.exercise_4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PowerLevelScouter {

    public Integer scout(String word) {
        return getASCIICode(word, n -> (int) n.charAt(0));
    }

    public Integer scoutEnhanced(String word) {
        return getASCIICode(word, n -> (int) n.toLowerCase().charAt(0));
    }

    private Integer getASCIICode(String word, Function<String, Integer> transfrom) {
        Integer powerLevel = 0;
        List<String> letters = Arrays.asList(word.split(""));
        for (String letter : letters) {
            powerLevel += transfrom.apply(letter);
        }
        return powerLevel;
    }

}
//    Create the PowerLevelScouter class.
//      1-  Add to it the scout method that receives a
//        name and returns its power level as a number.
//        The power is calculated by summing up the ASCII code value of each letter.
//      2-  Add to it the scoutEnhanced method that
//      receives a name and returns its power level as a number.
//        The power is calculated by transforming the name to lowercase
//        and then summing up the ASCII code value of each letter.
//       3- Write tests for both methods.
