package week_6.Color;


import week_6.circle.Shape;

import java.util.Arrays;
import java.util.List;

public class BasicColorApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Name: " + rectangle.getName());
        Colored colored = new Rectangle();
        System.out.println("Colored: " + colored.getColor());
        Shape shape = new Rectangle();
        System.out.println("Name: " + shape.getName());

        List<Rectangle> rectangles = Arrays.asList(rectangle);
        System.out.println(rectangles);

        List<Colored> coloreds = Arrays.asList(rectangle, colored);
        System.out.println(coloreds);

        List<Shape> shapes = Arrays.asList(rectangle, shape);
        System.out.println(shapes);


    }
}
