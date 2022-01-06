package com.hjfruit.test.pitaya.app.apis.commodity;

import com.hjfruit.test.pitaya.app.entities.Option;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import com.hjfruit.test.pitaya.app.entities.plan.CommoditySkuAndUnitPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface CommodityApi {
    @GraphqlQuery(" 基础管理-商品分类-|商品类型接口|")
    List<Option> commodityList();
    @GraphqlQuery("")
    List<Option> supplierCommodityList();
    @GraphqlQuery("商品品类列表信息")
    List<CommodityCategoryPayload> listCommodityCategoryOption();
    @GraphqlQuery("品类id查询商品列表信息")
    List<CommodityPayload> listCommodityOptionByCategoryId(Integer categoryId);
    @GraphqlQuery("商品列表信息品类（商品名称查询）")
    List<CommodityPayload> listCommodities(String commodityName);
    @GraphqlQuery("商品规格和商品规格选项列表信息")
    List<CommoditySpecPayload> listCommoditySpecAndOption(Integer commodityId);
    @GraphqlQuery("根据商品sku id和规格列表查询具体信息")
    CommoditySkuAndUnitPayload getCommoditySkuAndUnitInfo(CommoditySkuAndUnitInput commoditySkuAndUnitInput);
    @GraphqlQuery("商品规格选项id数据和文字描述映射关系列表信息")
    List<CommoditySkuAndUnitPayload> listCommoditySkuAndUnit(Integer commodityId);
    @GraphqlQuery("sku列表接口（新）")
    List<CommoditySkuAndUnitPayload> skues(SkuQueryInput skuQueryInput);
}