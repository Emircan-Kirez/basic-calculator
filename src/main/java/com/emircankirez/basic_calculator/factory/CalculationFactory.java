package com.emircankirez.basic_calculator.factory;

import com.emircankirez.basic_calculator.enums.CalculationType;
import com.emircankirez.basic_calculator.strategy.CalculationStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CalculationFactory {

    private final Map<String, CalculationStrategy> strategyMap;

    public CalculationFactory(Map<String, CalculationStrategy> strategyMap) {
        this.strategyMap = strategyMap;
    }

    public CalculationStrategy getCalculationStrategy(String operator) {
        return strategyMap.get(CalculationType.getCalculationName(operator));
    }
}
