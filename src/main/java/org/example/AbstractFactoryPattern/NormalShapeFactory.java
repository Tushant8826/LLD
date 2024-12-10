package org.example.AbstractFactoryPattern;

public class NormalShapeFactory implements ShapeFactory{

    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
        };
        return null;
    }
}
