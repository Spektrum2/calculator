package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void welcome() {
        String actual = out.welcome();
        assertEquals(WELCOME, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void plus(int num1, int num2) {
        int actual = out.plus(num1, num2);
        assertEquals(PLUS, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void minus(int num1, int num2) {
        int actual = out.minus(num1, num2);
        assertEquals(MINUS, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void multiply(int num1, int num2) {
        int actual = out.multiply(num1, num2);
        assertEquals(MULTIPLY, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void divide(int num1, int num2) {
        double actual = out.divide(num1, num2);
        assertEquals(DIVIDE, actual);
    }

    @Test
    public void divideThrow() {
        assertThrows(IllegalArgumentException.class,
                () -> out.divide(CORRECT_NUM1, ILLEGAL_CHARACTERS_NUM)
        );
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(CORRECT_NUM1, CORRECT_NUM2)
        );
    }

}