package org.example.ch03;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADD("+") {
        @Override
        public int abstractCalculate(int op1, int op2) {
            return op1 + op2;
        }
    }, SUB("-") {
        @Override
        public int abstractCalculate(int op1, int op2) {
            return op1 - op2;
        }
    }, MULTI("*") {
        @Override
        public int abstractCalculate(int op1, int op2) {
            return op1 * op2;
        }
    }, DIV("/") {
        @Override
        public int abstractCalculate(int op1, int op2) {
            return op1 / op2;
        }
    };

    private final String operator;

    ArithmeticOperator(String operator) {
        this.operator = operator;
    }

    public abstract int abstractCalculate(final int op1, final int op2);
    
    public static int calculate(int op1, String operator, int op2) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
        
        return arithmeticOperator.abstractCalculate(op1, op2);
    }
}
