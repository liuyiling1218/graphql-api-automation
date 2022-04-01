package com.hjfruit.test.operation.web.apis.user;

import com.hjfruit.test.operation.web.entities.user.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface UserManageApi {
    @GraphqlMutation("创建用户")
    String createUserMange(UserMangerInput input);

    @GraphqlMutation("修改用户")
    Boolean updateUserManage(UserMangerInput input);

    @GraphqlMutation("修改密码")
    Boolean updatePassword(UpdatePasswordInput input);

    @GraphqlQuery("分页获取用户信息")
    UserPagePayload pageUserManage(PageUserInput input);

    @GraphqlQuery("获取员工信息")
    UserManagePayload userManage(Integer id);
}