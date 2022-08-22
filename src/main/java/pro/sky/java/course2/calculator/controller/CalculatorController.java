package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return number1 + " + " + number2 + " = " + calculatorService.plus(number1, number2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return number1 + " - " + number2 + " = " + calculatorService.minus(number1, number2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return number1 + " * " + number2 + " = " + calculatorService.multiply(number1, number2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        if (number1 == 0 || number2 == 0) {
            return "Ошибка ввода. Значение не должно быть равно нулю!";
        }
        return number1 + " / " + number2 + " = " + calculatorService.divide(number1, number2);
    }
}
