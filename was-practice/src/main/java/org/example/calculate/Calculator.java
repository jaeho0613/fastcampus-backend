package org.example.calculate;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AddOperator(), new SubOperator(), new MulOperator(), new DivOperator());

    public static int calculate(PositiveNumber op1, String operatorStr, PositiveNumber op2) {
        // return ArithmeticOperator.calculate(op1, operatorStr, op2);
        return arithmeticOperators.stream()
                .filter(newArithmeticOperator -> newArithmeticOperator.supports(operatorStr))
                .map(newArithmeticOperator -> newArithmeticOperator.calculate(op1, op2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
