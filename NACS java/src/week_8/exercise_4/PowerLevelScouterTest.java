package week_8.exercise_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {
    PowerLevelScouter powerLevelScouter = new PowerLevelScouter();
    @Test
    void scout() {
        Integer expected = 619;
        Assertions.assertEquals(expected,powerLevelScouter.scout("Susana"));
    }

    @Test
    void scoutEnhanced() {
        Integer expected = 651;
        Assertions.assertEquals(expected,powerLevelScouter.scoutEnhanced("Susana"));
    }
}