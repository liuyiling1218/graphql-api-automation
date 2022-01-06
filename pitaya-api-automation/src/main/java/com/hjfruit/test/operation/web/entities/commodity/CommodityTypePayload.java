package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

/**
 *
 */
@Data
public class CommodityTypePayload {
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 上级类型id
     */
    private Integer parentCommodityTypeId;
}