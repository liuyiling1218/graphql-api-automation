package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

/**
 * sku列表规格表头
 */
@Data
public class SkuColumnSpecPayload {
    /**
     * 规格id
     */
    private Integer commoditySpecId;
    /**
     * 规格名称
     */
    private String commoditySpecName;
}