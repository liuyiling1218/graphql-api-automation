package com.hjfruit.test.pitaya.app.entities.production.inorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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