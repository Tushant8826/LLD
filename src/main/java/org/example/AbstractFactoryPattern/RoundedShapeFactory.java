package org.example.AbstractFactoryPattern;

public class RoundedShapeFactory implements ShapeFactory{

    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType){
            case "Circle":
                return new RoundedCircle();
                case "Rectangle":
                    return new RoundedRectangle();
        };
        return null;
    }
}
