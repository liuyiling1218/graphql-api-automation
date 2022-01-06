package com.hjfruit.test.operation.web.apis.label;

import com.hjfruit.test.operation.web.entities.Page;
import com.hjfruit.test.operation.web.entities.label.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface LabelApi {
    @GraphqlQuery(" 标签列表查询")
    LabelPagePayload listLabels(ListLabelsInput listLabelsInput, Page page);

    @GraphqlQuery(" 下拉标签列表")
    List<ListDropDownLabelsPayload> listDropDownLabels();

    @GraphqlMutation(" 新增标签")
    Integer createLabel(CreateLabelInput createLabelInput);

    @GraphqlMutation(" 修改标签")
    Integer updateLabel(UpdateLabelInput updateLabelInput);

    @GraphqlMutation(" 批量删除标签")
    Boolean batchDeleteLabels(BatchDeleteLabelsInput batchDeleteLabelsInput);
}