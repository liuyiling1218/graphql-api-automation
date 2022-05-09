package com.hjfruit.test.pitaya.app.entities.commodity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListCommodityCategoryInput {
    /**
     * FRUIT(1, "水果"),FOOD(2, "食品"),ASSIST(3, "辅料"),BOX(4, "周转筐"),RAW_MATERIAL(5, "原料"),PRODUCT(6, "成品"),HALF_PRODUCT(7, "半成品"),DEFECTIVE(8, "次品");
     */
    private List<Integer> commodityTypeId;
}