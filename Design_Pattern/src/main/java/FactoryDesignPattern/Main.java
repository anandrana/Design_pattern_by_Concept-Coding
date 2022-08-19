package FactoryDesignPattern;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape=shapeFactory.getShape("CIRCLE");
        shape.draw();
    }
}
