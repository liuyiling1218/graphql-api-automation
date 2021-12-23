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
        pitayaConfig.setDefaultUser("15023925077");
        pitayaConfig.setDefaultCheckCode("666666");
        pitayaConfig.setDefaultOrgId(341);
        pitayaConfig.setDefaultPassword("HJgyl-@123456");
    }

    @Override
    public void prepare() {
        log.info("===================开始准备基础数据======================");
        //todo 准备基础数据


//        String token = userAction.login("18800000000", "666666");

        log.info("===================基础数据准备结束======================");
    }

    @Override
    public void clear() {
        log.info("===================开始清理基础数据======================");
        //todo 清理基础数据


        log.info("===================基础数据清理结束======================");
    }


}
