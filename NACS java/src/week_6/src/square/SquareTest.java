package week_6.src.square;

import org.junit.jupiter.api.Test;
import week_6.src.circle.Shape;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void squareTest() {
        String expected = "square";
        Square square = new Square();
        assertEquals(expected,square.getName());
    }
    @Test
    void shapeTest() {
        String expected = "square";
        Shape square = new Square();
        assertEquals(expected,square.getName());
    }
}