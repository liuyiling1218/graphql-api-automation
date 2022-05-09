package com.hjfruit.test.pitaya.app.apis.statistics.api;

import com.hjfruit.test.pitaya.app.entities.statistics.api.GetProductionInput;
import com.hjfruit.test.pitaya.app.entities.statistics.type.KeeperConditionPayload;
import com.hjfruit.test.pitaya.app.entities.statistics.type.LeaderConditionPayload;
import com.hjfruit.test.pitaya.app.entities.statistics.type.ProductionControlPayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface ProductioncontrolApi {
    @GraphqlQuery("")
    ProductionControlPayload getProduction(GetProductionInput input);

    @GraphqlQuery("")
    List<LeaderConditionPayload> listLeaderCondition(GetProductionInput input);

    @GraphqlQuery("")
    List<KeeperConditionPayload> listKeeperCondition(GetProductionInput input);
}