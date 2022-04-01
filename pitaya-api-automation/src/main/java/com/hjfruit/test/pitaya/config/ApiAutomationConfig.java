package com.hjfruit.test.pitaya.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "test.yaml")
public class ApiAutomationConfig {
    public static String basePackage;

    @Value("${test.yaml.base-package}")
    public static void setBasePackage(String basePackage) {
        ApiAutomationConfig.basePackage = basePackage;
    }

    public static String getBasePackage() {
        return basePackage;
    }
}
