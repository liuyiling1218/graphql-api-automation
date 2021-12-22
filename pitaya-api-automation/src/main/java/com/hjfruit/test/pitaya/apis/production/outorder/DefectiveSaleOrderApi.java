package com.hjfruit.test.pitaya.apis.production.outorder;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.outorder.CreateDefectiveSaleOrderInput;
import com.hjfruit.test.pitaya.entities.production.outorder.OutOrderPagePayload;
import com.hjfruit.test.pitaya.entities.production.outorder.PageDefectiveSaleOrderInput;
import com.hjfruit.test.pitaya.entities.production.outorder.UpdateDefectiveSaleOrderInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface DefectiveSaleOrderApi {
    @GraphqlQuery("")
    OutOrderPagePayload pageDefectiveSaleOrder(PageDefectiveSaleOrderInput pageDefectiveSaleOrder, Page page);

    @GraphqlMutation("")
    String createDefectiveSaleOrder(CreateDefectiveSaleOrderInput createDefectiveSaleOrderInput);

    @GraphqlMutation("")
    String updateDefectiveSaleOrder(UpdateDefectiveSaleOrderInput updateDefectiveSaleOrderInput);
}