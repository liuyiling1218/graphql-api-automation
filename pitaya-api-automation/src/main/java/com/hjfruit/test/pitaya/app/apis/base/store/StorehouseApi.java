package com.hjfruit.test.pitaya.app.apis.base.store;

import com.hjfruit.test.pitaya.app.entities.base.store.WarehouseInput;
import com.hjfruit.test.pitaya.app.entities.base.store.WarehousePayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
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