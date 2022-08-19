package FactoryDesignPattern;

public class ShapeFactory {

    Shape getShape(String input){
        switch (input){
            case "CIRCLE":
                return new Circle();

            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
