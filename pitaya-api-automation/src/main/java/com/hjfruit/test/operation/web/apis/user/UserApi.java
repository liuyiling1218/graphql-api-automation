package com.hjfruit.test.operation.web.apis.user;

import com.hjfruit.test.operation.web.entities.user.CurrentUserPayload;
import com.hjfruit.test.operation.web.entities.user.LoginInput;
import com.hjfruit.test.operation.web.entities.user.PermissionPayload;
import com.hjfruit.test.operation.web.entities.user.SendCodeMsgInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface UserApi {
    @GraphqlMutation("登陆,返回登陆令牌token")
    String login(LoginInput input);

    @GraphqlMutation("发送验证码")
    Boolean sendCodeMsg(SendCodeMsgInput input);

    @GraphqlMutation("刷新token")
    String refreshToken();

    @GraphqlQuery("获取当前用户信息")
    CurrentUserPayload getCurrentUser();

    @GraphqlQuery("获取权限列表")
    List<PermissionPayload> getPermission();
}