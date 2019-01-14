package week_6.src.square;

import org.junit.jupiter.api.Test;
import week_6.src.circle.Shape;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void triangleTest() {
        String expected = "triangle";
        Triangle triangle = new Triangle();
        assertEquals(expected,triangle.getName());
    }

    @Test
    void shapeTest() {
        String expected = "triangle";
         Shape triangle = new Triangle();
        assertEquals(expected,triangle.getName());
    }
}