package com.emircankirez.basic_calculator.strategy;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("subtraction")
public class SubtractionStrategy implements CalculationStrategy {

    @Override
    public String makeCalculation(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber + " - " + secondNumber + " = " + firstNumber.subtract(secondNumber);
    }
}
