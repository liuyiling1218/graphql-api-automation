package com.hjfruit.test.pitaya.app.entities.base.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppExceptionInput {
    /**
     * 平台类型
     */
    private String platform;
    /**
     * appId
     */
    private Integer appId;
    /**
     * 异常版本
     */
    private String systemVersion;
    /**
     *
     */
    private String version;
    /**
     * 异常类型
     */
    private Integer exceptionType;
    /**
     * 异常信息
     */
    private String message;
}