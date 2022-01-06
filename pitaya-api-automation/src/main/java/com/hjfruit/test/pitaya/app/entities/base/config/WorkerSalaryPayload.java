package com.hjfruit.test.pitaya.app.entities.base.config;

import com.hjfruit.test.pitaya.entities.base.config.ConfigValuePayload;
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