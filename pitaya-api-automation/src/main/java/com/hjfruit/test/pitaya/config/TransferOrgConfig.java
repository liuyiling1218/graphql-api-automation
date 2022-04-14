package com.hjfruit.test.pitaya.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("transfer-org")
@Data
public class TransferOrgConfig {
    private Integer orgId;
    private String mobile;
    private String validCode;
}