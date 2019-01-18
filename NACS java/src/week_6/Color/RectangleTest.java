package week_6.Color;

import org.junit.jupiter.api.Test;
import week_6.circle.Shape;


import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {


    @Test
    void rectangleColorTest() {
        String expected = "violet";
        Rectangle rectangle = new Rectangle();
        assertEquals(expected, rectangle.getColor());
    }

    @Test
    void rectangleNameTest() {
        String expected = "Rectangle";
        Rectangle rectangle = new Rectangle();
        assertEquals(expected, rectangle.getName());
    }

    @Test
    void ColoredTest() {
        String expected = "violet";
        Colored color = new Rectangle();
        assertEquals(expected, color.getColor());
    }

    @Test
    void ShapeTest() {
        String expected = "Rectangle";
        Shape shape = new Rectangle();
        assertEquals(expected, shape.getName());
    }
}