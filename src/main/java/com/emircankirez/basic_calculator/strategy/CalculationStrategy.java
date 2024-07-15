package com.emircankirez.basic_calculator.strategy;

import java.math.BigDecimal;

public interface CalculationStrategy {

    String makeCalculation(BigDecimal firstNumber, BigDecimal secondNumber);
}
