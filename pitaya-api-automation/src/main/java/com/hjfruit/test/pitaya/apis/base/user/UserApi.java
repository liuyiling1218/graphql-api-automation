package com.hjfruit.test.pitaya.apis.base.user;

import com.hjfruit.test.pitaya.entities.Option;
import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.base.user.*;
import com.hjfruit.test.pitaya.entities.user.ListUserOrgInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
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