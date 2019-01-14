package week_8.Exercise_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class NumberFilterTest {
    private NumberFilter numberFilter = new NumberFilter();
    private List<Integer> numbers = Arrays.asList(1,2,3,4,56,7,8,9);

    @Test
    void testGetEven() {
        List<Integer> evenNumbers = numberFilter.getEven(numbers);
        List<Integer> expectedEvenNUmbers = Arrays.asList(2,4,56,8);
        Assertions.assertEquals(expectedEvenNUmbers,evenNumbers);

    }

    @Test
    void testGetOdd() {
        List<Integer> evenNumbers = numberFilter.getOdd(numbers);
        List<Integer> expectedevennumbers = Arrays.asList(1,3,7,9);
        Assertions.assertEquals(expectedevennumbers,evenNumbers);

    }
}