package com.hjfruit.test.pitaya.apis.cost;

import com.hjfruit.test.pitaya.entities.Option;
import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.cost.*;
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
    CountCostOrderPayload countNotSubmitCostOrder();

    @GraphqlQuery("查询费用类型下拉框选项")
    List<Option> freightCostOption();

    @GraphqlMutation("修改费用单")
    Integer updateCostOrder(UpdateCostOrderInput updateCostOrderInput);

    @GraphqlMutation("提交财务")
    Integer submitCostOrder(@Needed @ID String applyId);

    @GraphqlMutation("变更费用单状态")
    Boolean updateCostStatus(UpdateCostStatusInput updateCostStatusInput);
}