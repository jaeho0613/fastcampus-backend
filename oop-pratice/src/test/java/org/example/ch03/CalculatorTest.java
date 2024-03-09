package org.example.ch03;

import org.example.ch03.Calculator;
import org.example.ch03.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;


public class CalculatorTest {

    @DisplayName("덧셈 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateTest(int op1, String operator, int op2, int result) {
        int result2 = Calculator.calculate(new PositiveNumber(op1), operator, new PositiveNumber(op2));
        
        assertThat(result2).isEqualTo(result);
    }

    public static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                Arguments.arguments(1, "+", 2, 3),
                Arguments.arguments(1, "-", 2, -1),
                Arguments.arguments(2, "*", 2, 4),
                Arguments.arguments(2, "/", 2, 1)
        );
    }

    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalArgumet 예외를 발생시킨다.")
    @Test
    void calculateExceptionTest() {
        assertThatCode(() -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0으로 나눌 수 없습니다.");
        
    }

}
