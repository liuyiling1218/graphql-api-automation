package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionOutOrderLogPayload {
    /**
     * 出库订单日志id
     */
    private Integer outOrderLogId;
    /**
     * 出库订单id
     */
    private String outOrderId;
    /**
     * 出库订单操作类型10：创建时间20：提交时间30：出库时间40：取消时间;
     */
    private Integer outOrderLogType;
    /**
     * 出库订单操作枚举文字
     */
    private String outOrderLogTypeText;
    /**
     * 出库订单操作备注
     */
    private String outOrderLogDescription;
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