package com.hjfruit.test.pitaya.app.entities.base.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 开关
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionSwitchPayload {
    /**
     *
     */
    private Boolean productionSwitch;
}