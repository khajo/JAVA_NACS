package week_8.Exercise_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    public List<String> getFindElegant(String text) {
        Predicate<String> condition = word -> word.startsWith("ele");
        return filter(text, condition);
    }

    public List<String> getFindPlayful(String text) {
        Predicate<String> condition = word -> word.endsWith("ful");
        return filter(text, condition);
    }


    public List<String> filter(String text, Predicate<String> condition) {
        List<String> words = getSplited(text);
        List<String> filtered = new ArrayList<>();
        for (String word : words) {
            if (condition.test(word)) {
                filtered.add(word);
            }
        }

        return filtered;
    }

    private List<String> getSplited(String word) {
        String[] split = word.split(" ");
        List<String> words = Arrays.asList(split);
        return words;
    }

}
