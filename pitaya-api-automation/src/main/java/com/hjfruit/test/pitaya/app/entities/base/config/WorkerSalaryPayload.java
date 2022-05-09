package com.hjfruit.test.pitaya.app.entities.base.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 工资
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerSalaryPayload {
    /**
     *
     */
    private BigDecimal workerSalary;
}