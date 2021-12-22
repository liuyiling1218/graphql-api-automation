package com.hjfruit.test.pitaya.apis.plan;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.plan.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.ID;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface PlanApi {
    @GraphqlQuery("商品库存查询")
    List<CommoditySkuStockPayload> getCommodityStock(CommoditySkuStockInput commoditySkuStockInput);

    @GraphqlQuery("计划列表")
    PlanPageResult pageProductionPlan(PlanQueryInput planQueryInput, Page page);

    @GraphqlQuery("生产计划详情")
    ProductionPlanDetailPayload getProductionPlanDetail(@ID String planId);

    @GraphqlQuery("操作日志列表")
    List<ProductionPlanLogPayLoad> productionPlanLogs(@ID String planId);

    @GraphqlQuery("生产计划状态数量统计")
    ProductionPlanStatus productionPlanStatusOption(Long planDate);

    @GraphqlMutation("修改生产计划")
    String doUpdatePlanInfo(UpdateProductionPlanInput updateProductionPlanInput);

    @GraphqlMutation("发布计划")
    String doPublishPlan(@ID String planId);

    @GraphqlMutation("修改生产计划基础信息")
    String doUpdatePlanBaseInfo(PlanBaseInfoInput planBaseInfoInput);

    @GraphqlMutation("修改生产计划任务信息")
    String doUpdatePlanTaskInfo(PlanTaskInfoInput planTaskInfoInput);

    @GraphqlMutation("删除生产计划任务")
    String doDeletePlanTask(@ID String taskId);

    @GraphqlMutation("新增生产计划任务")
    String doInsertPlanTask(TaskInput taskInput);

    @GraphqlMutation("取消生产计划")
    String doCancelPlanStatus(CancelPlanInput cancelPlanInput);

    @GraphqlMutation("新增生产计划")
    String doInsertPlan(PlanInfoInput planInfoInput);

    @GraphqlMutation("完成计划")
    Boolean completePlan(@ID String planId);

    @GraphqlMutation("取消计划")
    Boolean cancelPlan(@ID String planId);
}