package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CommoditySpecDetailPayload {
    /**
     * 商品规格ID
     */
    private Integer commoditySpecId;
    /**
     * 商品规格名称
     */
    private String commoditySpecName;
    /**
     * 商品规格排序
     */
    private Integer commoditySpecSort;
    /**
     * 商品规格选项列表信息
     */
    private List<CommoditySpecOptionDetailPayload> commoditySpecOptionDetailPayload;
}