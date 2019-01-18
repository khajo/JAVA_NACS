package week_6.square;


import week_6.circle.Shape;

public class Square implements Shape {


    @Override
    public String getName() {
        return "square";
    }

    @Override
    public String toString() {
        return getName();
    }
}
