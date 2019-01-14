package week_6.src.circle;

public class Circle implements Shape {


    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
