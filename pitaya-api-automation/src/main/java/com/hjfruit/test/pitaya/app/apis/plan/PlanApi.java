package com.hjfruit.test.pitaya.app.apis.plan;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.annotation.NotEmpty;
import java.util.List;
import java.math.BigDecimal;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.app.entities.delivery.bill.api.*;
import com.hjfruit.test.pitaya.app.entities.user.*;
import com.hjfruit.test.pitaya.app.entities.label.*;
import com.hjfruit.test.pitaya.app.entities.convert.api.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.transfer.*;
import com.hjfruit.test.pitaya.app.entities.delivery.bill.type.*;
import com.hjfruit.test.pitaya.app.entities.production.common.*;
import com.hjfruit.test.pitaya.app.entities.common.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.api.*;
import com.hjfruit.test.pitaya.app.entities.statistics.type.*;
import com.hjfruit.test.pitaya.app.entities.production.inorder.api.*;
import com.hjfruit.test.pitaya.app.entities.statistics.api.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.type.*;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.type.*;
import com.hjfruit.test.pitaya.app.entities.base.config.*;
import com.hjfruit.test.pitaya.app.entities.delivery.order.type.*;
import com.hjfruit.test.pitaya.app.entities.*;
import com.hjfruit.test.pitaya.app.entities.statistics.*;
import com.hjfruit.test.pitaya.app.entities.production.task.*;
import com.hjfruit.test.pitaya.app.entities.stock.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.apply.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.type.*;
import com.hjfruit.test.pitaya.app.entities.base.user.*;
import com.hjfruit.test.pitaya.app.entities.convert.type.*;
import com.hjfruit.test.pitaya.app.entities.base.store.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.*;
import com.hjfruit.test.pitaya.app.entities.push.*;
import com.hjfruit.test.pitaya.app.entities.base.supplier.*;
import com.hjfruit.test.pitaya.app.entities.secondment.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.transfer.*;
import com.hjfruit.test.pitaya.app.entities.plan.*;
import com.hjfruit.test.pitaya.app.entities.production.order.*;
import com.hjfruit.test.pitaya.app.entities.delivery.order.api.*;
import com.hjfruit.test.pitaya.app.entities.base.customer.*;
import com.hjfruit.test.pitaya.app.entities.production.inorder.type.*;
import com.hjfruit.test.pitaya.app.entities.base.app.*;
import com.hjfruit.test.pitaya.app.entities.check.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import com.hjfruit.test.pitaya.app.entities.v2.common.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.*;
import com.hjfruit.test.pitaya.app.entities.cost.common.*;
import com.hjfruit.test.pitaya.app.entities.base.location.*;
import com.hjfruit.test.pitaya.app.entities.org.*;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface PlanApi {
    @GraphqlQuery("商品库存查询")
    List<CommoditySkuStockPayload> getCommodityStock(CommoditySkuStockInput commoditySkuStockInput);
    @GraphqlQuery("")
    PlanPageResult pageProductionPlan(PlanQueryInput planQueryInput,Page page);
    @GraphqlQuery("")
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
    @GraphqlMutation("")
    String doInsertPlan(PlanInfoInput planInfoInput);
    @GraphqlMutation("完成计划")
    Boolean completePlan(@ID String planId);
    @GraphqlMutation("取消计划")
    Boolean cancelPlan(@ID String planId);
}