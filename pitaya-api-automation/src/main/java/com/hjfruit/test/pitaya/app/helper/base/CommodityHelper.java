package com.hjfruit.test.pitaya.app.helper.base;

import com.hjfruit.test.pitaya.app.actions.base.commodity.CommodityQueryAction;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CommodityHelper {

    @Autowired
    CommodityQueryAction commodityQueryAction;


    /**
     * 根据商品类型 和数量 获取商品sku
     *
     * @param commodityType
     * @param num
     * @return
     */
    public List<CommoditySkuPayload> getCommoditySkues(PitayaConstants.CommodityType commodityType, Integer num) {
        return getCommoditySkues(commodityType, null, num);
    }

    /**
     * 根据 商品类型 、 商品sku类型 获取指定数量的商品sku
     *
     * @param commodityType    商品类型
     * @param commoditySkuType 商品sku类型（单单位/双单位）
     * @param num              数量
     * @return
     */
    public List<CommoditySkuPayload> getCommoditySkues(PitayaConstants.CommodityType commodityType, PitayaConstants.CommoditySkuType commoditySkuType, Integer num) {

        List<CommoditySkuPayload> commoditySkuPayloads = new ArrayList<>(num);

        ListCommodityCategoryInput listCommodityCategoryInput = new ListCommodityCategoryInput();

        if (Arrays.asList(PitayaConstants.CommodityType.RAW_MATERIAL,
                PitayaConstants.CommodityType.DEFECTIVE,
                PitayaConstants.CommodityType.HALF_PRODUCT,
                PitayaConstants.CommodityType.HALF_PRODUCT,
                PitayaConstants.CommodityType.REBACK).contains(commodityType)) {
            listCommodityCategoryInput.setCommodityTypeId(Arrays.asList(PitayaConstants.CommodityType.FRUIT.getTypeId(), PitayaConstants.CommodityType.FOOD.getTypeId()));
        } else {
            listCommodityCategoryInput.setCommodityTypeId(Arrays.asList(commodityType.getTypeId()));
        }

        List<CommodityCategoryPayload> commodityCategoryPayloads = commodityQueryAction.commodityCategories(listCommodityCategoryInput);

        for (int i = 0; i < commodityCategoryPayloads.size(); i++) {
            if (num == 0) {
                break;
            }
            ListCommodityInput listCommodityInput = new ListCommodityInput();
            listCommodityInput.setCategoryId(commodityCategoryPayloads.get(i).getCategoryId());
            listCommodityInput.setHasBom(false);
            if (Arrays.asList(PitayaConstants.CommodityType.RAW_MATERIAL,
                    PitayaConstants.CommodityType.DEFECTIVE,
                    PitayaConstants.CommodityType.HALF_PRODUCT,
                    PitayaConstants.CommodityType.HALF_PRODUCT,
                    PitayaConstants.CommodityType.REBACK).contains(commodityType)) {
                listCommodityInput.setCommodityTypeId(Arrays.asList(PitayaConstants.CommodityType.FRUIT.getTypeId(), PitayaConstants.CommodityType.FOOD.getTypeId()));
            } else {
                listCommodityInput.setCommodityTypeId(Arrays.asList(commodityType.getTypeId()));
            }
            List<CommodityPayload> commodities = commodityQueryAction.commodities(listCommodityInput);

            for (int j = 0; j < commodities.size(); j++) {

                ListCommoditySkuInput listCommoditySkuInput = new ListCommoditySkuInput();
                listCommoditySkuInput.setCommodityId(commodities.get(j).getCommodityId());
                listCommoditySkuInput.setHasBom(Boolean.FALSE);
                listCommoditySkuInput.setCommodityTypeId(Arrays.asList(commodityType.getTypeId()));
                List<CommoditySkuPayload> commoditySkues = commodityQueryAction.commoditySkues(listCommoditySkuInput);

                commoditySkues = commoditySkues.stream().filter(o -> {
                    if (commoditySkuType == null) {
                        return true;
                    }
                    if (o.getTotalType() != 0 && commoditySkuType == PitayaConstants.CommoditySkuType.DOUBLE_UNIT) {
                        return true;
                    } else if (o.getTotalType() == 0 && commoditySkuType == PitayaConstants.CommoditySkuType.SINGLE_UNIT) {
                        return true;
                    } else {
                        return false;
                    }
                }).collect(Collectors.toList());

                if (commoditySkues.size() < num) {
                    commoditySkuPayloads.addAll(commoditySkues);
                    num = num - commoditySkues.size();
                } else {
                    commoditySkuPayloads.addAll(commoditySkues.subList(0, num));
                    num = 0;
                    break;
                }
            }
        }
        return commoditySkuPayloads;
    }
}
