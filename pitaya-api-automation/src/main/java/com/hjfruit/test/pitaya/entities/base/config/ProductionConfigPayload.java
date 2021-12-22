package com.hjfruit.test.pitaya.entities.base.config;

import lombok.Data;

/**
 *
 */
@Data
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