package com.hjfruit.test.pitaya.entities.secondment;

import lombok.Data;

/**
 *
 */
@Data
public class SecondmentLogPayload {
    /**
     *
     */
    private String secondmentLogId;
    /**
     *
     */
    private String secondmentId;
    /**
     *
     */
    private Integer secondmentLogType;
    /**
     *
     */
    private String secondmentLogTypeText;
    /**
     *
     */
    private String secondmentLogDescription;
    /**
     *
     */
    private Long createTime;
    /**
     *
     */
    private Integer createBy;
    /**
     *
     */
    private String createUserName;
}