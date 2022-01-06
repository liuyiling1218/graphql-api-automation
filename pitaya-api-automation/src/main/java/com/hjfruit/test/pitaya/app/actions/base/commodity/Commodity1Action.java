package com.hjfruit.test.pitaya.app.actions.base.commodity;

import com.hjfruit.test.pitaya.app.apis.commodity.CommodityApi;
import com.hjfruit.test.pitaya.app.entities.Option;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import com.hjfruit.test.pitaya.app.entities.plan.CommoditySkuAndUnitPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Commodity1Action {
    @Autowired
    CommodityApi commodityApi;

    /**
     * 基础管理-商品分类-|商品类型接口|
     *
     * @return
     */
    public List<Option> commodityList() {
        return commodityApi.commodityList();
    }

    /**
     * @return
     */
    public List<Option> supplierCommodityList() {
        return commodityApi.supplierCommodityList();
    }

    /**
     * 商品品类列表信息
     *
     * @return
     */
    public List<CommodityCategoryPayload> listCommodityCategoryOption() {
        return commodityApi.listCommodityCategoryOption();
    }

    /**
     * 品类id查询商品列表信息
     *
     * @param categoryId
     * @return
     */
    public List<CommodityPayload> listCommodityOptionByCategoryId(Integer categoryId) {
        return commodityApi.listCommodityOptionByCategoryId(categoryId);
    }

    /**
     * 商品列表信息品类（商品名称查询）
     *
     * @param commodityName
     * @return
     */
    public List<CommodityPayload> listCommodities(String commodityName) {
        return commodityApi.listCommodities(commodityName);
    }

    /**
     * 商品规格和商品规格选项列表信息
     *
     * @param commodityId
     * @return
     */
    public List<CommoditySpecPayload> listCommoditySpecAndOption(Integer commodityId) {
        return commodityApi.listCommoditySpecAndOption(commodityId);
    }

    /**
     * 根据商品sku id和规格列表查询具体信息
     *
     * @param commoditySkuAndUnitInput
     * @return
     */
    public CommoditySkuAndUnitPayload getCommoditySkuAndUnitInfo(CommoditySkuAndUnitInput commoditySkuAndUnitInput) {
        return commodityApi.getCommoditySkuAndUnitInfo(commoditySkuAndUnitInput);
    }

    /**
     * 商品规格选项id数据和文字描述映射关系列表信息
     *
     * @param commodityId
     * @return
     */
    public List<CommoditySkuAndUnitPayload> listCommoditySkuAndUnit(Integer commodityId) {
        return commodityApi.listCommoditySkuAndUnit(commodityId);
    }

    /**
     * sku列表接口（新）
     *
     * @param skuQueryInput
     * @return
     */
    public List<CommoditySkuAndUnitPayload> skues(SkuQueryInput skuQueryInput) {
        return commodityApi.skues(skuQueryInput);
    }

}
