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
public class ProductionInOrderLogPayload {
    /**
     * 入库订单日志id
     */
    private String inOrderLogId;
    /**
     * 入库订单id
     */
    private String inOrderId;
    /**
     * 入库订单操作类型10：创建时间20：提交时间30：入库时间40：取消时间;
     */
    private Integer inOrderLogType;
    /**
     * 入库订单操作枚举文字
     */
    private String inOrderLogTypeText;
    /**
     * 入库订单操作备注
     */
    private String inOrderLogDescription;
    /**
     *
     */
    private Long createTime;
    /**
     *
     */
    private Integer createBy;
    /**
     * 创建用户名称
     */
    private String createUserName;
}