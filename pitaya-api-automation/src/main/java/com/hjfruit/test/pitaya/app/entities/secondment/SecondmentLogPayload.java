package com.hjfruit.test.pitaya.app.entities.secondment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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