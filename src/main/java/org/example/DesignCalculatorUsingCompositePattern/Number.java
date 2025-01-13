package org.example.DesignCalculatorUsingCompositePattern;

public class Number implements ArithmeticExpression{

    int num;

    public Number(int num){
        this.num = num;
    }

    @Override
    public int evaluate() {
        System.out.println("Number value is :" + num);
        return num;
    }
}
