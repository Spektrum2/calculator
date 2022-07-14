package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        int total = num1 + num2;
        return num1 + " + " + num2 + " = " + total;
    }

    @Override
    public String minus(int num1, int num2) {
        int total = num1 - num2;
        return num1 + " - " + num2 + " = " + total;
    }

    @Override
    public String multiply(int num1, int num2) {
        int total = num1 * num2;
        return num1 + " * " + num2 + " = " + total;
    }

    @Override
    public String divide(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return "Ошибка ввода. Значение не должно быть рано нулю!";
        }
        double total = num1 / num2;
        return num1 + " / " + num2 + " = " + total;
    }
}
