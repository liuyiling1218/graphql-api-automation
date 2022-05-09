package com.hjfruit.test.pitaya.app.entities.base.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionConfigPayload {
    /**
     *
     */
    private Integer id;
    /**
     * 临时工 1000正式工 1001提前领料 1100
     */
    private Integer configCode;
    /**
     *
     */
    private Integer orgId;
    /**
     *
     */
    private ConfigValuePayload configValue;
    /**
     *
     */
    private Long createTime;
    /**
     *
     */
    private Long updateTime;
    /**
     *
     */
    private Integer createBy;
    /**
     *
     */
    private Integer updateBy;
}