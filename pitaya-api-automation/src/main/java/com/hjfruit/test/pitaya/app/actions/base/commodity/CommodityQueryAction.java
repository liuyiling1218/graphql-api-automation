package com.hjfruit.test.pitaya.app.actions.base.commodity;

import com.hjfruit.test.pitaya.app.apis.commodity.CommodityQueryApi;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommodityQueryAction {
    @Autowired
    CommodityQueryApi commodityQueryApi;

    /**
     * @param listCommodityCategoryInput
     * @return
     */
    public List<CommodityCategoryPayload> commodityCategories(ListCommodityCategoryInput listCommodityCategoryInput) {
        return commodityQueryApi.commodityCategories(listCommodityCategoryInput);
    }

    /**
     * @param listCommodityInput
     * @return
     */
    public List<CommodityPayload> commodities(ListCommodityInput listCommodityInput) {
        return commodityQueryApi.commodities(listCommodityInput);
    }

    /**
     * @param listCommoditySpecInput
     * @return
     */
    public List<CommoditySpecPayload> commoditySpecs(ListCommoditySpecInput listCommoditySpecInput) {
        return commodityQueryApi.commoditySpecs(listCommoditySpecInput);
    }

    /**
     * @param listCommoditySkuInput
     * @return
     */
    public List<CommoditySkuPayload> commoditySkues(ListCommoditySkuInput listCommoditySkuInput) {
        return commodityQueryApi.commoditySkues(listCommoditySkuInput);
    }

    /**
     * @param getCommoditySkuInput
     * @return
     */
    public CommoditySkuPayload commoditySku(GetCommoditySkuInput getCommoditySkuInput) {
        return commodityQueryApi.commoditySku(getCommoditySkuInput);
    }
}
