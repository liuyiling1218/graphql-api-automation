package com.hjfruit.test.pitaya.app.apis.label;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.label.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface LabelApi {
    @GraphqlQuery("查询推荐标签")
    ListRecommendLabelPayload listRecommendLabel(ListRecommendLabelInput listRecommendLabelInput, Page page);

    @GraphqlQuery("查询快捷标签")
    ListQuickLabelPayload listQuickLabel(ListQuickLabelInput listQuickLabelInput, Page page);

    @GraphqlMutation("创建快捷标签，增量")
    QuickLabelPayload createQuickLabel(CreateQuickLabelInput createQuickLabelInput);
}