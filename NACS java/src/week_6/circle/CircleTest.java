package week_6.circle;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void circleTest() {
        String expected = "Circle";
        Circle circle = new Circle();
        String circleName = circle.getName();
        assertEquals(expected, circleName);
    }

    @Test
    void shapeTest() {
        String expeted = "Circle";
        Shape circle = new Circle();
        String shapeName = circle.getName();
        assertEquals(expeted, shapeName);
    }
}