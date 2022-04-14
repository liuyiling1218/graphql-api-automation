package com.hjfruit.test.pitaya.app.actions.user;

import com.hjfruit.test.pitaya.app.apis.base.user.UserApi;
import com.hjfruit.test.pitaya.app.apis.user.LoginApi;
import com.hjfruit.test.pitaya.app.entities.user.*;
import com.hjfruit.test.pitaya.common.PitayaAutheration;
import com.hjfruit.test.pitaya.common.PitayaBaseAction;
import com.hjfruit.test.pitaya.common.PitayaConfig;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import fc.test.api.graphql.Autheration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author SUIWEI WU
 * @date 2021/10/27 11:10
 */
@Component
public class LoginAction extends PitayaBaseAction {
    @Autowired
    LoginApi loginApi;
    @Autowired
    UserApi userApi;
    @Autowired
    PitayaConfig pitayaConfig;

    /**
     * 获取验证码
     *
     * @return
     */
    public SendSmsPayload sendCode(String mobile) {
        //获取验证码
        SendSmsInput sendSmsInput = new SendSmsInput();
        sendSmsInput.setMobile(mobile);
        Autheration.required = false;
        return loginApi.sendSms(sendSmsInput);
    }

    /**
     * 验证码登录
     *
     * @return
     */
    public LoginPayload loginWithCode(String mobile, String code) {
        sendCode(mobile);
        LoginInput loginInput = new LoginInput();
        loginInput.setUsername(mobile);
        loginInput.setCheckCode(code);
        Autheration.required = false;
        return loginApi.login(loginInput);
    }

    public void logout() {
        LoginPayload loginPayload = this.loginWithCode(pitayaConfig.getDefaultUser(), pitayaConfig.getDefaultCheckCode());
        //绑定orgId
        BindOrgInput bindOrgInput = new BindOrgInput();
        bindOrgInput.setOrgId(pitayaConfig.getDefaultOrgId());
        bindOrgInput.setBindToken(loginPayload.getToken());
        BindOrgPayload bindOrgPayload = loginApi.bindOrg(bindOrgInput);

        PitayaAutheration.orgId = pitayaConfig.getDefaultOrgId();
        Autheration.token = bindOrgPayload.getToken();
        Autheration.currentUser = pitayaConfig.getDefaultUser();
    }

    /**
     * 密码登录
     *
     * @return
     */
    public LoginPayload loginWithPwd(String mobile, String code) {
        LoginInput loginInput = new LoginInput();
        loginInput.setUsername(mobile);
        loginInput.setCheckCode(code);
        return loginApi.login(loginInput);
    }

    /**
     * 修改密码
     *
     * @return
     */
    public ChangePwdPayload firstLoginToUpdatePwd(String oldPwd, String newPwd) {
        ChangePwdInput changePwdInput = new ChangePwdInput();
        changePwdInput.setOldPwd(oldPwd);
        changePwdInput.setNewPwd(newPwd);
        return loginApi.changePwd(changePwdInput);
    }

    public void switchUserAndOrg(String mobile, String code, Integer orgId) {
        LoginPayload loginPayload = this.loginWithCode(mobile, code);
        Autheration.token = loginPayload.getToken();

        BindOrgInput bindOrgInput = new BindOrgInput();
        bindOrgInput.setOrgId(orgId);
        bindOrgInput.setBindToken(Autheration.token);
        BindOrgPayload bindOrgPayload = loginApi.bindOrg(bindOrgInput);
        Autheration.token = bindOrgPayload.getToken();
    }

    /**
     * 切换账号登录
     */
    public void switchUser(PitayaConstants.User user) {
        LoginPayload loginPayload = this.loginWithCode(user.getUsername(), user.getCheckcode());
        Autheration.currentUser = user.getUsername();
        Autheration.token = loginPayload.getToken();
    }

    /**
     * 已登录用户 切换分拣仓
     */
    public void switchOrgId(Integer orgId) {
        BindOrgInput bindOrgInput = new BindOrgInput();
        bindOrgInput.setOrgId(orgId);
        bindOrgInput.setBindToken(Autheration.token);

        BindOrgPayload bindOrgPayload = loginApi.bindOrg(bindOrgInput);
        Autheration.token = bindOrgPayload.getToken();
        PitayaAutheration.orgId = orgId;
    }
}