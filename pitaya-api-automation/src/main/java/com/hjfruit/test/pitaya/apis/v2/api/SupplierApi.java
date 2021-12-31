package com.hjfruit.test.pitaya.apis.v2.api;

import com.hjfruit.test.pitaya.entities.v2.types.SupplierType;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface SupplierApi {
    @GraphqlQuery("")
    List<SupplierType> supplierTypes();
}