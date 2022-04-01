package com.hjfruit.test.operation.web.entities.peach;

import lombok.Data;

import java.util.List;

/**
 * 编辑sku状态
 */
@Data
public class PeachUpdateStatusInput {
    /**
     * 状态
     */
    private Integer status;
    /**
     * sku id
     */
    private List<Integer> commoditySkuId;
}