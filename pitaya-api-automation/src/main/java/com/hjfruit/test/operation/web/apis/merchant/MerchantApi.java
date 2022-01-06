package com.hjfruit.test.operation.web.apis.merchant;

import com.hjfruit.test.operation.web.entities.Option;
import com.hjfruit.test.operation.web.entities.merchant.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface MerchantApi {
    @GraphqlMutation("创建商户")
    Boolean creteMerchant(MerchantInput input);

    @GraphqlMutation("修改商户")
    Boolean updateMerchant(MerchantInput input);

    @GraphqlQuery("分页获取商户列表")
    MerchantPagePayload pageMerchant(MerchantPageInput input);

    @GraphqlQuery("获取商户信息")
    MerchantPayload merchant(MerchantIdInput input);

    @GraphqlQuery("获取商户下拉")
    List<Option> merchantOption();

    @GraphqlQuery("搜索员工")
    List<SearchUserPayload> searchUser(SearchUserInput input);
}