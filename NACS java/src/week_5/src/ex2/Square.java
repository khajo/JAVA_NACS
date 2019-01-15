package ex2;


import ex1.Shape;

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
