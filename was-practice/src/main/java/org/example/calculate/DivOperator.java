package org.example.calculate;

public class DivOperator implements NewArithmeticOperator {

    @Override
    public boolean supports(String operator) {
        return "div".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber op1, PositiveNumber op2) {
        return op1.toInt() / op2.toInt();
    }
}
