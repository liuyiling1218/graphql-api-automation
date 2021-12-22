package com.hjfruit.test.pitaya.apis.base.supplier;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.base.supplier.SupplierConditionInput;
import com.hjfruit.test.pitaya.entities.base.supplier.SupplierInput;
import com.hjfruit.test.pitaya.entities.base.supplier.SupplierPagePayload;
import com.hjfruit.test.pitaya.entities.base.supplier.SupplierPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
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