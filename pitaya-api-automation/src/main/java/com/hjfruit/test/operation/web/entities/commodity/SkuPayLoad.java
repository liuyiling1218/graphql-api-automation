package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class SkuPayLoad {
    /**
     * sku Id
     */
    private Integer commoditySkuId;
    /**
     * sku名称
     */
    private String commoditySkuName;
    /**
     * 规格选项
     */
    private List<SkuCommoditySpecOption> skuCommoditySpecOptionList;
}