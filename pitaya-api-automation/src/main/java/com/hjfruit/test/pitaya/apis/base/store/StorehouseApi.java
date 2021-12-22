package com.hjfruit.test.pitaya.apis.base.store;

import com.hjfruit.test.pitaya.entities.base.store.WarehouseInput;
import com.hjfruit.test.pitaya.entities.base.store.WarehousePayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface StorehouseApi {
    @GraphqlQuery("")
    List<WarehousePayload> listWarehouse();

    @GraphqlQuery("")
    List<WarehousePayload> userWarehouse();

    @GraphqlQuery("")
    WarehousePayload warehouse(@Needed Integer warehouseId);

    @GraphqlMutation("")
    Integer insertWarehouse(@Needed WarehouseInput warehouseInput);

    @GraphqlMutation("")
    Integer updateWarehouse(@Needed WarehouseInput warehouseInput);

    @GraphqlMutation("")
    Integer deleteWarehouse(@Needed Integer warehouseId);
}