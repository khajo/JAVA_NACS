package week_6.individual;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IndividualNumbersTest {
    IndividualNumbers individualNumbers = new IndividualNumbers();
    @Test
    void testGetIndividualList() {
        List<Integer> expectedNumber = Arrays.asList(1,5,3,4);
        assertEquals(expectedNumber,individualNumbers.getIndividualList(1534));
    }
}