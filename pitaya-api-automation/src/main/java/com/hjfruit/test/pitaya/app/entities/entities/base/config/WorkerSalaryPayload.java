package com.hjfruit.test.pitaya.app.entities.entities.base.config;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 工资
 */
@Data
public class WorkerSalaryPayload implements ConfigValuePayload {
    /**
     *
     */
    private BigDecimal workerSalary;
}