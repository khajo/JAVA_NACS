package week_6.src.square;

import week_6.src.circle.Shape;

public class Triangle implements Shape {


    @Override
    public String getName() {

        return "triangle";
    }

    @Override
    public String toString() {

        return getName();
    }
}
