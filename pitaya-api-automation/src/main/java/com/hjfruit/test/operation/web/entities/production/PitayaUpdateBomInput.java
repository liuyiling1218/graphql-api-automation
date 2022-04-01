package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 * 修改bom
 */
@Data
public class PitayaUpdateBomInput {
    /**
     * bom id
     */
    private Integer commodityBomId;
    /**
     * sku id
     */
    private Integer commoditySkuId;
    /**
     * 配料列表
     */
    private List<PitayaUpdateBomDetailInput> updateCommodityBomDetailInput;
}