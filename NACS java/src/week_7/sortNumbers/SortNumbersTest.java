package week_7.sortNumbers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortNumbersTest {

    List<Integer> numebrs = Arrays.asList(2,3,12);
    SortNumbers sortNumbers = new SortNumbers();

    @Test
    void testGetBiggestNumebr() {
        Integer biggestNumberExpected =12;
    assertEquals(biggestNumberExpected,sortNumbers.getBiggestNumebr(numebrs));
    }

    @Test
    void testGetSmallestNumber() {
        Integer smallestNumberExpected =2;
        assertEquals(smallestNumberExpected,sortNumbers.getSmallestNumber(numebrs));
    }
}