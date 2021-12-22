package com.hjfruit.test.pitaya.entities.plan;

import lombok.Data;

import java.util.List;

/**
 * #商品规格实体type CommoditySpecPayload {    #商品规格id    commoditySpecId: Int    #商品规格名称    commoditySpecName: String    #商品规格选项列表    commoditySpecOption: [CommoditySpecOptionPayload]}#商品规格选项实体type CommoditySpecOptionPayload {    #商品规格选项id    commoditySpecOptionId: Int    #商品规格选项名称    commoditySpecOptionName: String}
 */
@Data
public class ProductionTaskCommoditiesPayload {
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品sku id
     */
    private Integer commoditySkuId;
    /**
     * 规格选项id
     */
    private List<Integer> commoditySpecOptionId;
    /**
     * sku文字描述,规格选项文字数组
     */
    private List<String> skuTextDescription;
}