package ex2;

import ex1.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void getName() {
        String expected = "square";

        Square square = new Square();
        assertEquals(expected, square.getName());

        Shape shape = new Square();
        assertEquals(expected, shape.getName());
    }
}