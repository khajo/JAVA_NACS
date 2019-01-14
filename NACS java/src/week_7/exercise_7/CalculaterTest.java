package week_7.exercise_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculaterTest {
    Calculater calculater = new Calculater();

    @Test
    void testCalculater() {
        Assertions.assertEquals("You can transport the celebrities",calculater.Calculater(11,11,0));


    }
}