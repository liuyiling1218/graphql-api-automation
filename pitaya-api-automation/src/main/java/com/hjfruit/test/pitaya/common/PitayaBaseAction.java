package com.hjfruit.test.pitaya.common;

import fc.test.api.graphql.BaseAction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author SUIWEI WU
 * @date 2021/11/10 9:22
 */
@Slf4j
@Component
public class PitayaBaseAction implements BaseAction {


    @Autowired
    PitayaConfig pitayaConfig;

//    @Autowired
//    UserAction userAction;

    @Override
    public void config() {
    }

    @Override
    public void prepare() {
        log.info("===================基础数据开始执行======================");
        //初始化一个分拣仓并设置为默认用户和仓库
        //todo 初始化分拣仓
        pitayaConfig.setDefaultUser("15023925077");
        pitayaConfig.setDefaultCheckCode("666666");
        pitayaConfig.setDefaultOrgId(341);
        pitayaConfig.setDefaultPassword("HJgyl-@123456");


//        String token = userAction.login("18800000000", "666666");

        log.info("===================基础数据执行结束======================");
    }


}
