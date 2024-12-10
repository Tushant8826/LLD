package org.example.Factory;

public class ShapeFactory {
    Shape getShape(String shapeName) {
        switch (shapeName) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
