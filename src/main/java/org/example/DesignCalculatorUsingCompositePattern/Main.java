package org.example.DesignCalculatorUsingCompositePattern;

public class Main {

    public static void main(String[] args) {
        ArithmeticExpression one  = new Number(1);
        ArithmeticExpression two  = new Number(2);
        ArithmeticExpression seven  = new Number(7);

        ArithmeticExpression addExpression = new Expression(one,seven,Operation.ADD);
        ArithmeticExpression parentExpression = new Expression(two,addExpression,Operation.MULTIPLY);

        parentExpression.evaluate();
    }
}
