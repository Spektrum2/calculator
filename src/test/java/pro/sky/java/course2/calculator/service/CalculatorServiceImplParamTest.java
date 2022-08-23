package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplParamTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldPlusCorrectly(int num1, int num2) {
        int result = out.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldMinusCorrectly(int num1, int num2) {
        int result = out.minus(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldMultiplyCorrectly(int num1, int num2) {
        int result = out.multiply(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldDivideCorrectly(int num1, int num2) {
        double result = out.divide(num1, num2);
        assertEquals((double) num1 / num2, result);
    }


    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(ZERO, THREE),
                Arguments.of(ONE, ONE)
        );
    }

}