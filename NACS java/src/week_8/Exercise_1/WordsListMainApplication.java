package week_8.Exercise_1;

import java.util.ArrayList;
import java.util.List;


public class WordsListMainApplication {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("somewhere");
        words.add("scenario");
        words.add("table");
        words.add("cable");
        words.add("glass");
        words.add("glass");
        words.add("backpack");
        words.add("mouse");


        words.removeIf(e -> e.endsWith("e"));
        System.out.println("The words ends with e: " + words);

        words.replaceAll(e -> e.toUpperCase());
        System.out.println("The words Upper case: " + words);

        words.removeIf(e -> e.length() < 6);
        System.out.println("The words less than 6 letter: "+words);

        words.forEach(name-> System.out.println(name));
        System.out.println("MUSTaFa" +
                "");

    }
}
