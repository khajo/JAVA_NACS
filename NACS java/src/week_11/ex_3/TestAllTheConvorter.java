package week_11.ex_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestAllTheConvorter {


    @Test
    void testGetTimeLessThan30() {
        MinuteLessThanThirty minuteLessThanThirty = new MinuteLessThanThirty();
        List<Integer> time = minuteLessThanThirty.getTime(2, 20);
        List<Integer> expexted = Arrays.asList(2, 20);
        Assertions.assertEquals(expexted,time);
    }
    @Test
    void testGetTimeMoreThan30() {
        MinuteMoreThanThirty minuteMoreThanThirty = new MinuteMoreThanThirty();
        List<Integer> time = minuteMoreThanThirty.getTime(2, 31);
        List<Integer> expexted = Arrays.asList(3, 29);
        Assertions.assertEquals(expexted,time);
    }
}