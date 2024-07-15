package com.emircankirez.basic_calculator.enums;

import java.util.Locale;

public enum CalculationType {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    private String operator;

    CalculationType(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public static String getCalculationName(String operator) {
        for (CalculationType calculationType : CalculationType.values()) {
            if (calculationType.getOperator().equals(operator)) {
                return calculationType.name().toLowerCase(Locale.ENGLISH);
            }
        }
        throw new IllegalArgumentException("Invalid operator");
    }
}
