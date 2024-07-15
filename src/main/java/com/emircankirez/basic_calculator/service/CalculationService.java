package com.emircankirez.basic_calculator.service;

import com.emircankirez.basic_calculator.model.CalculationRequest;
import com.emircankirez.basic_calculator.factory.CalculationFactory;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    private final CalculationFactory calculationFactory;

    public CalculationService(CalculationFactory calculationFactory) {
        this.calculationFactory = calculationFactory;
    }

    public String calculate(CalculationRequest calculationRequest) {
        return calculationFactory.getCalculationStrategy(calculationRequest.getOperator())
                .makeCalculation(calculationRequest.getFirstOperand(), calculationRequest.getSecondOperand());
    }
}
