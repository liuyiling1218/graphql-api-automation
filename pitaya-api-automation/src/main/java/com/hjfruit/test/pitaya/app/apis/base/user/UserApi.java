package com.hjfruit.test.pitaya.app.apis.base.user;

import com.hjfruit.test.pitaya.app.entities.Option;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.base.user.*;
import com.hjfruit.test.pitaya.app.entities.user.ListUserOrgInput;
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
public interface UserApi {
    @GraphqlMutation("")
    Integer createUser(UserInput userInput);

    @GraphqlMutation("")
    Integer updateUser(UserInput userInput);

    @GraphqlMutation("")
    Integer deleteUser(Integer userId);

    @GraphqlQuery("")
    List<Option> listProductLeader(@Needed ProductInput productInput);

    @GraphqlQuery("")
    UserPayload userInformation(Integer userId);

    @GraphqlQuery("")
    UserPageResult userInformationList(Page page);

    @GraphqlQuery("")
    Integer userExist(@Needed String phoneNum);

    @GraphqlQuery("")
    UserPayload userBaseInfo(@Needed String phoneNum);

    @GraphqlQuery(" 1.9新增 查询用户组织列表")
    List<Organization> listUserOrg(ListUserOrgInput listUserOrgInput, Page page);
}