package com.hjfruit.test.pitaya.app;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hjfruit.test.pitaya.PitayaBaseTest;
import com.hjfruit.test.pitaya.app.actions.user.LoginAction;
import com.hjfruit.test.pitaya.app.apis.user.LoginApi;
import com.hjfruit.test.pitaya.common.PitayaBaseAction;
import com.hjfruit.test.pitaya.common.PitayaConfig;
import fc.test.api.graphql.Autheration;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.IOException;

import static io.restassured.RestAssured.given;

/**
 * @author SUIWEI WU
 * @date 2021/11/9 15:28
 */
@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PitayaAppBaseTestV2 extends PitayaBaseTest {
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
    public void beforeEach() throws IOException, InterruptedException {
        System.out.println("============beforeEach Start============");
//        https://stackoverflow.com/questions/28908835/ssl-peer-shut-down-incorrectly-in-java
        System.setProperty("https.protocols", "TSLv1.1");

        //假设一切正常

        sendSmsCode("15023925077");
        String token = loginByMsgCode("15023925077");
        Autheration.token = token;
        listAllUserInfo(token);
        chooseTenant(token);
        listUserOrg(2, token);
        chooseOrg(token,"341");



        System.out.println("============beforeEach End============");
    }

    private void chooseOrg(String token,String orgId) {
        RequestSpecification requestSpecification =
                commonRequest()
                        .header("authorization", token)
                        .body("{\"orgId\": \"" + orgId + "\"}");
        Response login = requestSpecification.post("https://auth-test.hjgpscm.com/auth/chooseOrg");

    }

    private void listUserOrg(int appId, String token) {
        RequestSpecification requestSpecification =
                commonRequest()
                        .header("authorization", token)
                        .body("{\"appId\": \"" + appId + "\"}");
        Response login = requestSpecification.post("https://auth-test.hjgpscm.com/auth/listOrg");
    }

    private void chooseTenant(String token) {
        RequestSpecification requestSpecification =
                commonRequest()
                        .header("authorization", token)
                        .body("{\"tenantId\": \"1\"}");
        Response login = requestSpecification.post("https://auth-test.hjgpscm.com/auth/chooseTenant");
    }

    private void listAllUserInfo(String token) {

        RequestSpecification requestSpecification =
                commonRequest()
                        .header("authorization", token);
        Response login = requestSpecification.post("https://auth-test.hjgpscm.com/auth/getUserAllInfo");
        JSONObject jsonObject = JSONObject.parseObject(login.body().asString());
        System.out.println(jsonObject.getJSONObject("data").toString());

    }

    private void sendSmsCode(String phone) {
        RequestSpecification requestSpecification = commonRequest()
                .body("{\"phone\":\"" + phone + "\"}");
        Response sendSmsCode = requestSpecification.post("https://auth-test.hjgpscm.com/auth/sendCodeMsg");

    }

    private String loginByMsgCode(String phone) {
        RequestSpecification requestSpecification =
                commonRequest()
                        .body("{\"phone\":\"" + phone + "\",\"code\": \"666666\"}");
        Response login = requestSpecification.post("https://auth-test.hjgpscm.com/auth/loginByMsgCodeOnApp");
        JSONObject jsonObject = JSONObject.parseObject(login.body().asString());
        return jsonObject.getString("data");


    }

    public RequestSpecification commonRequest() {
        return given()
                .relaxedHTTPSValidation()
                .log()
                .all()
                .header("Accept-Encoding", "gzip")
                .header("Connection", "Keep-Alive")
                .header("app-version", "23")
                .header("appversioncode", "23")
                .header("platform", "android")
                .header("accept", "*/*")
                .header("User-Agent", "okhttp/3.12.12")
                .urlEncodingEnabled(true)
                .contentType(ContentType.JSON);
    }

    static class LoginResponse<T> {
        public String code;
        public String message;
        public T data;

    }

    @AfterAll
    public void afterAll() {
//        pitayaBaseAction.clear();
    }
}
