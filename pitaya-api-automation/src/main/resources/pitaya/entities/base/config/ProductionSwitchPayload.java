package com.hjfruit.test.pitaya.entities.base.config;

import lombok.Data;

/**
 * 开关
 */
@Data
public class ProductionSwitchPayload implements ConfigValuePayload {
    /**
     *
     */
    private Boolean productionSwitch;
}