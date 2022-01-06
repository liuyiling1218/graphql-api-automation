package com.hjfruit.test.operation.web.apis.reportform;

import com.hjfruit.test.operation.web.entities.reportform.OptionList;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface CommonReportformApi {
    @GraphqlQuery(" 所属商户下拉")
    OptionList listMerchantOption();

    @GraphqlQuery(" 出库类型下拉")
    OptionList listOutboundOption();

    @GraphqlQuery(" 支付方式下拉")
    OptionList listPayMethodOption();

    @GraphqlQuery(" 客户类型下拉")
    OptionList listCustomerTypeOption();
}