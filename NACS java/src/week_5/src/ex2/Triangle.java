package ex2;


import ex1.Shape;

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
