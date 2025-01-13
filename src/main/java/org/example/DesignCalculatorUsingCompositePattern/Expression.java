package org.example.DesignCalculatorUsingCompositePattern;

public class Expression implements ArithmeticExpression{

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
       int val  = 0;
        switch (operation){
            case ADD:
                val = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                val = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case MULTIPLY:
                val = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case DIVIDE:
                val = leftExpression.evaluate() / rightExpression.evaluate();
                break;
        }
        System.out.println("Expression value is :" + val);
        return val;
    }
}
