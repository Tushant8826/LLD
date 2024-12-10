package org.example.AbstractFactoryPattern;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        ShapeFactory roundShapeFactory = factoryProducer.getFactory(true);
        Shape circle = roundShapeFactory.getShape("Circle");
        circle.draw();
    }
}
