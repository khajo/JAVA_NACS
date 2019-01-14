package week_8.Exercise_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class KeywordFinderTest {
    private KeywordFinder keywordFinder = new KeywordFinder();
    private String text1 = "The elephant is lifted eleven floors easily with the " +
            "help of an electricity elevator";
    private String text2 = "he rightful heir of the powerful king had an awful" +
            " accident playing with a colorful bear";

    @Test
    void testFindElegant() {
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");
        List<String> filtered = keywordFinder.getFindElegant(text1);
        Assertions.assertEquals(expected, filtered);
    }

    @Test
    void testFindPlayful() {
        List<String> expected = Arrays.asList("rightful", "powerful", "awful", "colorful");
        List<String> filtered = keywordFinder.getFindPlayful(text2);
        Assertions.assertEquals(expected, filtered);
    }
}