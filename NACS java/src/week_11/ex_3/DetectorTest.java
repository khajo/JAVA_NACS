package week_11.ex_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DetectorTest {


    Detector detector = new Detector();
    @Test
    void testDetect() {
        List<Integer> time = detector.detect(20, 2);
        List<Integer> expexted = Arrays.asList(20, 2);
        Assertions.assertEquals(expexted,time);

    }
}