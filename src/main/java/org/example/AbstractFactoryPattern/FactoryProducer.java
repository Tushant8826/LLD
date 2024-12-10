package org.example.AbstractFactoryPattern;

public class FactoryProducer {

    public  ShapeFactory getFactory(boolean rounded){
        if(rounded) {
            return new RoundedShapeFactory();
        }else {
            return new NormalShapeFactory();
        }
    }
}
