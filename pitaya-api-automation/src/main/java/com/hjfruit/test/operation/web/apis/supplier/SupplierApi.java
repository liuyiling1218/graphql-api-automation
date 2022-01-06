package com.hjfruit.test.operation.web.apis.supplier;

import com.hjfruit.test.operation.web.entities.Page;
import com.hjfruit.test.operation.web.entities.supplier.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface SupplierApi {
    @GraphqlQuery(" 供应商分页查询")
    SupplierPageResult supplierPages(Page page, SupplierCondition supplierCondition);

    @GraphqlQuery(" 根据id查询供应商")
    SupplierResponse supplier(@Needed Integer supplierId);

    @GraphqlQuery(" 根据条件查询供应商是否已存在")
    Boolean supplierExist(@Needed SupplierExistInput input);

    @GraphqlMutation(" 创建供应商")
    Integer createSupplier(SupplierInput supplierInput);

    @GraphqlMutation(" 更新供应商")
    Integer updateSupplier(SupplierInput supplierInput);
}