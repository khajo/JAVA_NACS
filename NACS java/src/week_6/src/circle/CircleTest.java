package week_6.src.circle;

import org.junit.jupiter.api.Test;
import week_6.src.circle.Circle;
import week_6.src.circle.Shape;

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
    void shapeTest(){
        String expeted = "Circle";
        Shape circle = new Circle();
        String shapeName = circle.getName();
        assertEquals(expeted,shapeName);
    }
}