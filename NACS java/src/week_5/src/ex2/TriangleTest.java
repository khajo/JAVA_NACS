package ex2;


import ex1.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void getName() {
        String expected = "triangle";

        Triangle triangle = new Triangle();
        assertEquals(expected, triangle.getName());

        Shape shape = new Triangle();
        assertEquals(expected, shape.getName());
    }
}