package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 *
 */
@Data
public class OutOrderLogPayLoad {
    /**
     * 出库订单日志id
     */
    private Integer outOrderLogId;
    /**
     * * 出库订单id
     */
    private String outOrderId;
    /**
     * * 出库订单操作类型，10：创建时间、20：提交时间、30：出库时间、40：取消时间
     */
    private Integer outOrderLogType;
    /**
     * * 出库订单操作枚举文字
     */
    private String outOrderLogTypeText;
    /**
     * * 出库订单操作备注
     */
    private String outOrderLogDescription;
    /**
     * * 创建时间
     */
    private Long createTime;
    /**
     * * 创建用户id
     */
    private Integer createBy;
    /**
     * * 建用户名称
     */
    private String createUserName;
}