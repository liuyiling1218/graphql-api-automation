package com.hjfruit.test.operation.web.apis.peach;

import com.hjfruit.test.operation.web.entities.peach.PeachPageSkuInput;
import com.hjfruit.test.operation.web.entities.peach.PeachPageSkuPayload;
import com.hjfruit.test.operation.web.entities.peach.PeachTableHeadPayload;
import com.hjfruit.test.operation.web.entities.peach.PeachUpdateStatusInput;
import com.hjfruit.test.operation.web.entities.production.NotChosenSkuOption;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface PeachCommoditySkuApi {
    @GraphqlQuery("sku列表表头")
    PeachTableHeadPayload peachTableHead(Integer commodityId);

    @GraphqlQuery("sku列表")
    PeachPageSkuPayload peachPageSku(PeachPageSkuInput pageSku);

    @GraphqlQuery("未选择sku选项id集合")
    List<NotChosenSkuOption> peachNotChosenSkuOption(@Needed Integer commodityId);

    @GraphqlMutation("添加sku")
    List<Integer> peachCreateCommoditySku(List<Integer> commoditySkuId);

    @GraphqlMutation("编辑sku状态")
    List<Integer> peachUpdateSkuStatus(PeachUpdateStatusInput updateStatusInput);
}