package com.emircankirez.basic_calculator.model;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

public class CalculationRequest {

    @Schema(description = "First Operand", example = "10")
    private BigDecimal firstOperand;

    @Schema(description = "Second Operand", example = "5")
    private BigDecimal secondOperand;

    @Schema(description = "Operator", example = "+", allowableValues = "+, -, *, /")
    private String operator;

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }

    public String getOperator() {
        return operator;
    }
}
