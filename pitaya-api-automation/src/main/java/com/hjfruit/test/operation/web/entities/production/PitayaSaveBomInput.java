package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 * 新增bom
 */
@Data
public class PitayaSaveBomInput {
    /**
     * sku id
     */
    private Integer commoditySkuId;
    /**
     * 配料列表
     */
    private List<PitayaBomDetailInput> saveCommodityBomDetailInput;
}