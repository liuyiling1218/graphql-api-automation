package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 * 编辑sku编辑sku状态
 */
@Data
public class PitayaUpdateStatusInput {
    /**
     * 状态
     */
    private Integer status;
    /**
     * sku id
     */
    private List<Integer> commoditySkuId;
}