package com.hjfruit.test.pitaya.app.apis.convert.api;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.convert.api.*;
import com.hjfruit.test.pitaya.app.entities.convert.type.CommandOrderResp;
import com.hjfruit.test.pitaya.app.entities.convert.type.CommodityConvertPayload;
import com.hjfruit.test.pitaya.app.entities.convert.type.PageCommodityConvertPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface CommodityconvertApi {
    @GraphqlQuery("")
    PageCommodityConvertPayload pageCommodityConvert(PageCommodityConvertInput input, Page page);

    @GraphqlQuery("")
    CommodityConvertPayload getConvertDetail(OrderIdInput input);

    @GraphqlQuery("")
    PageCommodityConvertPayload pageAuditCommodityConvert(Page page);

    @GraphqlQuery("")
    Integer getStatusCount(GetStatusCountInput input);

    @GraphqlMutation("")
    CommandOrderResp createConvertOrder(CreateConvertInput input);

    @GraphqlMutation("")
    CommandOrderResp updateConvertOrder(UpdateConvertInput input);

    @GraphqlMutation("")
    Boolean submitOrder(CommondOrderStatusInput input);

    @GraphqlMutation("")
    Boolean cancelOrder(CommondOrderStatusInput input);

    @GraphqlMutation("")
    Boolean auditOrder(CommondOrderStatusInput input);

    @GraphqlMutation("")
    Boolean rejectOrder(CommondOrderStatusInput input);
}