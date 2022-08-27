package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnWelcomeMessage() {
        String actual = out.welcome();
        assertThat(actual).isEqualTo(WELCOME);
    }

    @Test
    public void shouldReturnFourWhenPlusOneAndThree() {
        int result = out.plus(ONE, THREE);
        assertEquals(ONE + THREE, result);

    }

    @Test
    public void shouldReturnThreeWhenPlusTwoAndOne() {
        int result = out.plus(TWO, ONE);
        assertEquals(TWO + ONE, result);
    }

    @Test
    public void shouldReturnTwoWhenMinusThreeAndOne() {
        int result = out.minus(THREE, ONE);
        assertEquals(THREE - ONE, result);
    }

    @Test
    public void shouldReturnOneWhenMinusTwoAndOne() {
        int result = out.minus(TWO, ONE);
        assertEquals(TWO - ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenMultiplyOneAndThree() {
        int result = out.multiply(ONE, THREE);
        assertEquals(ONE * THREE, result);
    }

    @Test
    public void shouldReturnSixWhenMultiplyTwoAndOne() {
        int result = out.multiply(TWO, THREE);
        assertEquals(TWO * THREE, result);
    }

    @Test
    public void shouldReturnResultWhenDivideOneAndThree() {
        double result = out.divide(ONE, THREE);
        assertEquals((double) ONE / THREE, result);
    }

    @Test
    public void shouldReturnResultWhenDivideTwoAndOne() {
        double result = out.divide(TWO, ONE);
        assertEquals((double) TWO / ONE, result);
    }

    @Test
    public void divideThrow() {
        assertThrows(IllegalArgumentException.class,
                () -> out.divide(TWO, ZERO)
        );
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> out.divide(3, 0))
                .withMessage("Ошибка ввода. Значение не должно быть равно нулю!");
    }
}
