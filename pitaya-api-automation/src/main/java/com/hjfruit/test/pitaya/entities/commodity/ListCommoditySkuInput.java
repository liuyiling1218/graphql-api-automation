package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class ListCommoditySkuInput {
    /**
     *
     */
    private Integer commodityId;
    /**
     *
     */
    private Boolean hasBom;
    /**
     * FRUIT(1, "水果"),FOOD(2, "食品"),ASSIST(3, "辅料"),BOX(4, "周转筐"),RAW_MATERIAL(5, "原料"),PRODUCT(6, "成品"),HALF_PRODUCT(7, "半成品"),DEFECTIVE(8, "次品");
     */
    private List<Integer> commodityTypeId;
}