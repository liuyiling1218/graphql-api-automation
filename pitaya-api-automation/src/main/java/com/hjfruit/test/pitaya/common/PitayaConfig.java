package com.hjfruit.test.pitaya.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author SUIWEI WU
 * @date 2021/11/10 13:34
 */
@Data
@Component
@ConfigurationProperties("pitaya.config")
public class PitayaConfig {
    private String serverUrl;
    private String defaultUser;
    private String defaultCheckCode;
    private String defaultPassword;
    private Integer defaultOrgId;
}
