package com.emircankirez.basic_calculator.controller;

import com.emircankirez.basic_calculator.model.CalculationRequest;
import com.emircankirez.basic_calculator.service.CalculationService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculation")
public class CalculationController {

    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @PostMapping
    @Operation(summary = "Calculate", description = "Calculate the result of the given operation")
    public ResponseEntity<String> calculate(@RequestBody CalculationRequest calculationRequest) {
        return ResponseEntity.ok(calculationService.calculate(calculationRequest));
    }
}
