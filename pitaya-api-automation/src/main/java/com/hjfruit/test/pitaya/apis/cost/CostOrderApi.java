package com.hjfruit.test.pitaya.apis.cost;

import com.hjfruit.test.pitaya.entities.Option;
import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.cost.CostOrderPayload;
import com.hjfruit.test.pitaya.entities.cost.PageCostOrderInput;
import com.hjfruit.test.pitaya.entities.cost.PageCostOrderPayload;
import com.hjfruit.test.pitaya.entities.cost.UpdateCostOrderInput;
import fc.test.api.graphql.annotation.*;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface CostOrderApi {
    @GraphqlQuery("分页查询费用单信息")
    PageCostOrderPayload pageCostOrder(PageCostOrderInput pageCostOrderInput, Page page);

    @GraphqlQuery("获取费用单详情")
    CostOrderPayload getCostOrderDetail(@Needed @ID String applyId);

    @GraphqlQuery("查询未提交费用单条数")
    Integer countNotSubmitCostOrder();

    @GraphqlQuery("查询费用类型下拉框选项")
    List<Option> freightCostOption();

    @GraphqlMutation("修改费用单")
    Integer updateCostOrder(UpdateCostOrderInput updateCostOrderInput);

    @GraphqlMutation("提交财务")
    Integer submitCostOrder(@Needed @ID String applyId);
}