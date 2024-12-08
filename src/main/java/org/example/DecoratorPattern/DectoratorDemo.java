package org.example.DecoratorPattern;

public class DectoratorDemo {
    public static void main(String[] args) {
        BasePizza basePizza  = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(basePizza.cost());
    }
}
