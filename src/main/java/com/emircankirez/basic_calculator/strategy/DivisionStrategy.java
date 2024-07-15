package com.emircankirez.basic_calculator.strategy;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service("division")
public class DivisionStrategy implements CalculationStrategy {

    @Override
    public String makeCalculation(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber + " / " + secondNumber + " = " + firstNumber.divide(secondNumber, 3, RoundingMode.HALF_UP);
    }
}
