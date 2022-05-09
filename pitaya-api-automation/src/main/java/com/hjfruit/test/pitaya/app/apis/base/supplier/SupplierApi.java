package com.hjfruit.test.pitaya.app.apis.base.supplier;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.base.supplier.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface SupplierApi {
    @GraphqlQuery("")
    SupplierPagePayload supplierPages(Page page, SupplierConditionInput supplierCondition);

    @GraphqlQuery("")
    SupplierPayload supplier(GetSupplierInput getSupplierInput);

    @GraphqlQuery("")
    List<SupplierPayload> suppliers(SupplierConditionInput supplierCondition);

    @GraphqlMutation("")
    Integer createSupplier(SupplierInput supplierInput);

    @GraphqlMutation("")
    Integer updateSupplier(SupplierInput supplierInput);

    @GraphqlMutation("")
    Integer deleteSupplier(Integer supplierId);
}