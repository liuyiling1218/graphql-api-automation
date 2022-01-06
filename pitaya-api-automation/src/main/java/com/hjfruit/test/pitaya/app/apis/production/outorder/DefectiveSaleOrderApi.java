package com.hjfruit.test.pitaya.app.apis.production.outorder;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.outorder.CreateDefectiveSaleOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.OutOrderPagePayload;
import com.hjfruit.test.pitaya.app.entities.production.outorder.PageDefectiveSaleOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.UpdateDefectiveSaleOrderInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface DefectiveSaleOrderApi {
    @GraphqlQuery("")
    OutOrderPagePayload pageDefectiveSaleOrder(PageDefectiveSaleOrderInput pageDefectiveSaleOrder, Page page);

    @GraphqlMutation("")
    String createDefectiveSaleOrder(CreateDefectiveSaleOrderInput createDefectiveSaleOrderInput);
    @GraphqlMutation("")
    String updateDefectiveSaleOrder(UpdateDefectiveSaleOrderInput updateDefectiveSaleOrderInput);
}