package com.hjfruit.test.pitaya.app.apis.base.store;

import com.hjfruit.test.pitaya.app.entities.base.store.WarehouseInput;
import com.hjfruit.test.pitaya.app.entities.base.store.WarehousePayload;
import fc.test.api.graphql.annotation.*;
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
    WarehousePayload warehouse(@Needed @ID String warehouseId);

    @GraphqlMutation("")
    String insertWarehouse(@Needed WarehouseInput warehouseInput);

    @GraphqlMutation("")
    String updateWarehouse(@Needed WarehouseInput warehouseInput);

    @GraphqlMutation("")
    String deleteWarehouse(@Needed @ID String warehouseId);
}