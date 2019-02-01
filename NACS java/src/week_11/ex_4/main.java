package week_11.ex_4;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2018-06-21");
        int year = localDate.getYear();
        Boolean isYear = localDate.isLeapYear();
        System.out.println(year);
        System.out.println(isYear);
        Integer mount = localDate.getMonthValue();
        System.out.println(mount);

        Checking checking = new Checking();
//        System.out.println(checking.check("Pale", "lapes"));
        Replace replace = new Replace();
        System.out.println(replace.getLeftOverLetters("pale","iple"));
        System.out.println(new Remove().getLeftOverLetters("Pale","Pel"));


//        System.out.println(isInsert("Pale", "Pales"));
//        System.out.println(getRestLetterOfChckedWord("pale", "ple").length());
//        System.out.println(getRestLetterOfMainWord("pale", "ple"));
//        System.out.println(isRemove("Pale", "ple"));
//        System.out.println(isReplace("Pale", "bale"));

    }
//
//    public static List<String> insert(String word, String checkWord) {
//
//        List<String> collect = Stream.of(checkWord)
//                .filter(e -> e.length() == word.length() + 1)
//                //.map(e -> Arrays.asList(e.split("")))
//                .flatMap(e -> Stream.of(e))
//                .map(e -> Arrays.asList(e.split("")))
//                .map(e->e.get(4))
//                .filter(e->!word.contains(e))
//                .collect(Collectors.toList());
//
//
//        return collect;
//    }

//
//    public static Boolean isInsert(String word, String checkWord) {
//
//        return word.length() == checkWord.length() - 1 && getRestLetterOfMainWord(word, checkWord).length() == 1;
//    }
//
//    public static Boolean isReplace(String word, String checkWord) {
//
//        return word.length() == checkWord.length() && getRestLetterOfMainWord(word, checkWord).length() == 1;
//    }
//
//    public static Boolean isRemove(String word, String checkWord) {
//
//        return word.length() == checkWord.length() + 1 && getRestLetterOfMainWord(word, checkWord).length() == 1;
//    }
//
//
//    private static String getRestLetterOfChckedWord(String word, String checkWord) {
//        List<String> letters = Arrays.asList(word.toLowerCase().split(""));
//        checkWord = checkWord.toLowerCase();
//        for (String letter : letters) {
//            if (checkWord.contains(letter)) {
//                checkWord = checkWord.replaceAll(letter, "");
//            }
//        }
//        return checkWord;
//    }
//
//    private static String getRestLetterOfMainWord(String word, String checkWord) {
//        return Stream.of(word)
//                .map(e -> e.toLowerCase())
//                .map(e -> e.split(""))
//                // .peek(e -> System.out.println(Arrays.deepToString(e)))
//                .flatMap(e -> Stream.of(e))
//                //  .peek(e -> System.out.println(e))
//                //     .filter(e -> !checkWord.toLowerCase().contains(e))
//                .map(e -> checkWord.replace(e, ""))
//                .collect(Collectors.joining());
//
//    }
//
//    private static String getRestLetterOfMainWord(String word, String checkWord) {
//        List<String> letters = Arrays.asList(checkWord.toLowerCase().split(""));
//        word = word.toLowerCase();
//        for (String letter : letters) {
//            if (word.contains(letter)) {
//                word = word.replaceAll(letter, "");
//            }
//        }
//        return word;
//    }

}
