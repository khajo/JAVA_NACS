package week_9.ex_2;


import ex9.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class StreamTest {
    FileReader reader = new FileReader();
    List<String> names = reader.asStream("week_9/ex_2/names.txt")
            .collect(Collectors.toList());


    @Test
    void testNamesList() {
        List<String> expectedList = Arrays.asList("Adib", "Aizhana", "Ashkan", "Badi", "Diba", "El", "Erika", "Fatameh", "Hala"
                , "Hamada", "Hosam", "Khajag", "Leen", "Mahtab", "Marj", "Mehran", "Mohamed", "Amin", "Tammam", "Moustafa", "Niklas", "Norbert", "Omar", "Paul", "Paulius", "Rabie",
                "Riyad", "Sahar", "Serife", "Tamara", "Tina");
        Assertions.assertEquals(expectedList, names);
        System.out.println(names);
    }

    @Test
    void testNamesLessThanFourCharacters() {
        List<String> namesLessThanFourCharacters = names.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("El");
        Assertions.assertEquals(expected, namesLessThanFourCharacters);
        System.out.println(namesLessThanFourCharacters);
    }

    // Create a list with the names that end with the letter “m” and make them upper case. Check that the output is correct.
    @Test
    void testNamesEndWithM() {
        List<String> namesEndWithM = names.stream()
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("HOSAM", "TAMMAM");
        Assertions.assertEquals(expected, namesEndWithM);
        System.out.println(namesEndWithM);
    }
    // Create a list with the names that contain the letters “e” and “r”. Check that the output is correct.

    @Test
    void testNamesCountainsRAndE() {
        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        List<String> namesCountainsRAndE = names.stream()
                .filter(e -> e.contains("e"))
                .filter(e -> e.contains("r"))
                .collect(Collectors.toList());
        Assertions.assertEquals(expected, namesCountainsRAndE);
        System.out.println(namesCountainsRAndE);
    }
    //  Create a list with the names that are exactly four characters long, make them lower case,
    //  keep those that contain the letters “a” and “m” and duplicate the number of letter “a”s that they have.
    @Test
    void testNamesLessThanFourCharactersWithLowerCase(){
        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");
        List<String> collect = names.stream()
                .filter(e -> e.length() == 4)
                .map(e -> e.toLowerCase())
                .filter(e -> e.contains("a") && e.contains("m"))
                .map(e -> e.replace("a", "aa"))
                .collect(Collectors.toList());
        Assertions.assertEquals(expected,collect);
        System.out.println(collect);

    }
}