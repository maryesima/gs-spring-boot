package com.example.services;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
    /**
     * Returns the computed result of two integers
     * @param operand The operand to be used for computation
     * @param num1 The first
     *                number to be operated on
     * @param num2 The second number to be operated on
     * @return the computed result
     */
    public static int applyOp(String operand, int num1, int num2) {
        switch (operand) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0)
                    throw new UnsupportedOperationException("Cannot divide by 0");
                return num1 / num2;
        }
        return 0;
    }
}
