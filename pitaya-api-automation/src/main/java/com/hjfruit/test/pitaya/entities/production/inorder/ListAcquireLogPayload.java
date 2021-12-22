package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

/**
 *
 */
@Data
public class ListAcquireLogPayload {
    /**
     * 操作类型
     */
    private Integer type;
    /**
     * 创建人
     */
    private String createUserName;
    /**
     * 创建时间
     */
    private Long CreateTime;
    /**
     * 备注
     */
    private String note;
}