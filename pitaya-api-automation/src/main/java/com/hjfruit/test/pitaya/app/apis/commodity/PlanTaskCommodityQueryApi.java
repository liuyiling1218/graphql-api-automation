package com.hjfruit.test.pitaya.app.apis.commodity;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface PlanTaskCommodityQueryApi {
    @GraphqlQuery("任务商品选择列表接口")
    List<CommoditySkuPayload> planCommodites(ListPlanCommoditySkuInput listPlanCommodityInput);

    @GraphqlQuery("原料辅料领料商品列表接口")
    List<TaskAcquireMaterialCommodityPayload> taskAcquireMaterialCommodities(ListTaskAcquireMaterialCommodityInput listTaskAcquireMaterialCommodityInput);

    @GraphqlQuery("原料辅料退料商品列表接口")
    List<TaskReturnMaterialCommodityPayload> taskReturnMaterialCommodities(ListTaskInCommodityInput listTaskInCommodityInput);

    @GraphqlQuery("任务入库商品选择 退料与其他类型隔开")
    List<CommoditySkuPayload> taskInCommodities(ListTaskInCommodityInput listTaskInCommodityInput);

    @GraphqlQuery("更多商品列表接口")
    MoreCommoditiesPageResult pageMoreCommodities(PageMoreCommoditiesInput pageMoreCommoditiesInput, Page page);

    @GraphqlQuery("报损出库商品列表接口")
    List<DamagedCommoditiesPayload> damagedCommodities(DamagedCommoditiesInput damagedCommoditiesInput);
}