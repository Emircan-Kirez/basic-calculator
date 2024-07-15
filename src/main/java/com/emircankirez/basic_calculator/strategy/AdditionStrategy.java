package com.emircankirez.basic_calculator.strategy;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("addition")
public class AdditionStrategy implements CalculationStrategy {

    @Override
    public String makeCalculation(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber + " + " + secondNumber + " = " + firstNumber.add(secondNumber);
    }
}
