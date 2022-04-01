package com.hjfruit.test.pitaya.app.apis.base.supplier;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.base.supplier.SupplierConditionInput;
import com.hjfruit.test.pitaya.app.entities.base.supplier.SupplierInput;
import com.hjfruit.test.pitaya.app.entities.base.supplier.SupplierPagePayload;
import com.hjfruit.test.pitaya.app.entities.base.supplier.SupplierPayload;
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
    SupplierPayload supplier(Integer supplierId);

    @GraphqlQuery("")
    List<SupplierPayload> suppliers(SupplierConditionInput supplierCondition);

    @GraphqlMutation(" 创建供应商")
    Integer createSupplier(SupplierInput supplierInput);

    @GraphqlMutation(" 更新供应商")
    Integer updateSupplier(SupplierInput supplierInput);

    @GraphqlMutation(" 删除供应商")
    Integer deleteSupplier(Integer supplierId);
}