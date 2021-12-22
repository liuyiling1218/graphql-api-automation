package com.hjfruit.test.pitaya;

import com.hjfruit.test.pitaya.common.PitayaConfig;
import fc.test.api.graphql.annotation.ApiScan;
import fc.test.api.graphql.entity.GraphqlConifg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author SUIWEI WU
 * @date 2021/11/25 15:31
 */
@SpringBootApplication
@ApiScan("com.hjfruit.test.pitaya.apis")
@EnableConfigurationProperties({GraphqlConifg.class, PitayaConfig.class})
public class PitayaApiAutomationApplication {
    public static void main(String[] args) {
        SpringApplication.run(PitayaApiAutomationApplication.class, args);
    }
}
