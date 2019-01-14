package week_6.src.Color;


import week_6.src.circle.Shape;

public class Rectangle implements Colored, Shape {


    @Override
    public String getColor() {
        return "violet";
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return getColor() + " "+ getName();
    }
}
