package week_6.square;



import week_6.circle.Circle;
import week_6.circle.Shape;

import java.util.Arrays;
import java.util.List;

public class BasicShapesApplication {
    public static void main(String[] args) {

        Shape circle =  new Circle();
        System.out.println("Shape: "+circle.getName());

        Shape square = new Square();
        System.out.println("Shape: "+ square.getName());

       Shape triangle = new Triangle();
        System.out.println("Shape: "+ triangle.getName());

        List<Shape> shapes = Arrays.asList(circle,square,triangle);
        System.out.println(shapes);

        for (Shape shape : shapes) {
            System.out.println("Shape name: " + shape.getName());

        }


    }

}
