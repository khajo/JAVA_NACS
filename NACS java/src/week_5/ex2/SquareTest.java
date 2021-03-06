package week_5.ex2;

import week_5.ex1.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SquareTest {

    @Test
    void getName() {
        String expected = "square";

        Square square = new Square();
        Assertions.assertEquals(expected, square.getName());

        Shape shape = new Square();
        Assertions.assertEquals(expected, shape.getName());
    }
}