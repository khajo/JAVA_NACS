package week_6.circle;


public class CircleApplication {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println( "Class: "+ circle.getName());


        Shape shape = new Circle();
        System.out.println("Shape: "+ shape.getName());

        Shape anotherShape = new Circle();
        System.out.println("Another shape: "+ anotherShape.getName());
    }


}
