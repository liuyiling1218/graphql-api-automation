package com.hjfruit.test.pitaya.app.entities.base.config;

import com.hjfruit.test.pitaya.entities.base.config.ConfigValuePayload;
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