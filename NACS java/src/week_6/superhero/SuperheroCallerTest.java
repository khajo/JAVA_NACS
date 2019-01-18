package week_6.superhero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SuperheroCallerTest {

    @Test
    void callTest() {
        SuperheroCaller superheroCaller = new SuperheroCaller();
        assertNotNull(superheroCaller.call());
    }

    @Test
    void batmanNameTest() {
        String expected = "batman";
        Superhero batman = new Batman();
        assertEquals(expected,batman.getName());
    }
    @Test
    void suprrmanNameTest() {
        String expected = "superman";
        Superhero superman = new Superman();
        assertEquals(expected,superman.getName());
    }
    @Test
    void spiderNameTest() {
        String expected = "spiderman";
        Superhero spider = new Spiderman();
        assertEquals(expected,spider.getName());
    }
}