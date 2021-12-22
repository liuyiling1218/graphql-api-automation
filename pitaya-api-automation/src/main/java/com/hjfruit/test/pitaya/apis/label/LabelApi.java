package com.hjfruit.test.pitaya.apis.label;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.label.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface LabelApi {
    @GraphqlQuery("查询推荐标签")
    ListRecommendLabelPayload listRecommendLabel(ListRecommendLabelInput listRecommendLabelInput, Page page);

    @GraphqlQuery("查询快捷标签")
    ListQuickLabelPayload listQuickLabel(ListQuickLabelInput listQuickLabelInput, Page page);

    @GraphqlMutation("创建快捷标签，增量")
    QuickLabelPayload createQuickLabel(CreateQuickLabelInput createQuickLabelInput);
}