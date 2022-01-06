package com.hjfruit.test.pitaya.app;

import com.hjfruit.test.pitaya.PitayaBaseTest;
import com.hjfruit.test.pitaya.app.actions.user.LoginAction;
import com.hjfruit.test.pitaya.app.apis.user.LoginApi;
import com.hjfruit.test.pitaya.common.PitayaAutheration;
import com.hjfruit.test.pitaya.common.PitayaBaseAction;
import com.hjfruit.test.pitaya.common.PitayaConfig;
import com.hjfruit.test.pitaya.app.entities.user.BindOrgInput;
import com.hjfruit.test.pitaya.app.entities.user.BindOrgPayload;
import com.hjfruit.test.pitaya.app.entities.user.LoginPayload;
import fc.test.api.graphql.Autheration;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author SUIWEI WU
 * @date 2021/11/9 15:28
 */
@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PitayaAppBaseTest extends PitayaBaseTest {
    private static Boolean flag = true;
    @Autowired
    LoginAction loginAction;
    @Resource
    LoginApi loginApi;

    @Autowired
    PitayaBaseAction pitayaBaseAction;
    @Autowired
    PitayaConfig pitayaConfig;


    @BeforeAll
    public void beforAll() {
        System.out.println("============beforeAll Start============");
        pitayaBaseAction.config();
        if (flag) {
            try {
                pitayaBaseAction.prepare();
            } catch (Exception e) {
                log.warn("初始化数据失败，请确认数据已被完整初始化");
            }
            flag = false;
        }
        System.out.println("============beforeAll End============");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("============beforeEach Start============");
        LoginPayload loginPayload = null;
        BindOrgPayload bindOrgPayload = null;
        //若账号、orgId非默认，则自动重新登录默认账号、orgId
        if (Autheration.required) {
            if (!pitayaConfig.getDefaultUser().equals(Autheration.currentUser) || !pitayaConfig.getDefaultOrgId().equals(PitayaAutheration.orgId)) {
                //登录
                loginPayload = loginAction.loginWithCode(pitayaConfig.getDefaultUser(), pitayaConfig.getDefaultCheckCode());

                //绑定orgId
                BindOrgInput bindOrgInput = new BindOrgInput();
                bindOrgInput.setOrgId(pitayaConfig.getDefaultOrgId());
                bindOrgInput.setBindToken(loginPayload.getToken());
                bindOrgPayload = loginApi.bindOrg(bindOrgInput);

                PitayaAutheration.orgId = pitayaConfig.getDefaultOrgId();
                Autheration.token = bindOrgPayload.getToken();
                Autheration.currentUser = pitayaConfig.getDefaultUser();
            }
        } else {
            Autheration.token = null;
        }
        System.out.println("============beforeEach End============");
    }

    @AfterAll
    public void afterAll() {
//        pitayaBaseAction.clear();
    }
}
