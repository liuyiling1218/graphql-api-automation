package com.hjfruit.test.pitaya.app.apis.cost;

import com.hjfruit.test.pitaya.app.entities.Option;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.cost.*;
import fc.test.api.graphql.annotation.*;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface CostOrderApi {
    @GraphqlQuery("分页查询费用单信息")
    PageCostOrderPayload pageCostOrder(PageCostOrderInput pageCostOrderInput, Page page);

    @GraphqlQuery("获取费用单详情")
    CostOrderPayload getCostOrderDetail(@Needed @ID String billId);

    @GraphqlQuery("查询未提交费用单条数")
    CountCostOrderPayload countNotSubmitCostOrder();

    @GraphqlQuery("查询费用类型下拉框选项")
    List<Option> freightCostOption();

    @GraphqlMutation("修改费用单")
    String updateCostOrder(UpdateCostOrderInput updateCostOrderInput);

    @GraphqlMutation("变更费用单状态")
    Boolean updateCostStatus(UpdateCostStatusInput updateCostStatusInput);
}