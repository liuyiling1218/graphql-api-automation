package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class UpdateSkuStatusInput {
    /**
     * sku id集合
     */
    private List<Integer> commoditySkuIdList;
    /**
     * 状态（1激活，0禁用）
     */
    private Integer status;
}