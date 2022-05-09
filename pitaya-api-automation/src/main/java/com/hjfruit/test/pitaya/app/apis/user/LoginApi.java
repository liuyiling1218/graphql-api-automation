package com.hjfruit.test.pitaya.app.apis.user;

import com.hjfruit.test.pitaya.app.entities.base.user.UserPayload;
import com.hjfruit.test.pitaya.app.entities.user.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface LoginApi {
    @GraphqlQuery("")
    List<PermissionPayLoad> permissions();

    @GraphqlQuery("")
    UserPayload loginUserInfo();

    @GraphqlMutation("")
    LoginPayload login(LoginInput loginInput);

    @GraphqlMutation("")
    SendSmsPayload sendSms(SendSmsInput sendSmsInput);

    @GraphqlMutation("1.9 新增密码登录接口")
    LoginPwdPayload loginPwd(LoginPwdInput loginPwdInput);

    @GraphqlMutation("1.9 新增 登录用户绑定分拣仓接口")
    BindOrgPayload bindOrg(BindOrgInput bindOrgInput);

    @GraphqlMutation(" 1.9 新增密码修改接口")
    ChangePwdPayload changePwd(ChangePwdInput changePwdInput);

    @GraphqlMutation("")
    String refreshToken();
}