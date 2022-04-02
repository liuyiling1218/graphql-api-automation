package com.hjfruit.test.pitaya.app.entities.production.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferOtherItemBillPayload {
    /**
     * 运杂费属性（10:正常 20:调拨出库）
     */
    private Integer attr;
    /**
     *
     */
    private Integer billType;
    /**
     *
     */
    private String billTypeText;
    /**
     *
     */
    private Integer payMode;
    /**
     *
     */
    private String payModeText;
    /**
     *
     */
    private Integer supplierId;
    /**
     *
     */
    private String supplierName;
    /**
     *
     */
    private BigDecimal amount;
    /**
     *
     */
    private String brand;
    /**
     *
     */
    private String phone;
    /**
     *
     */
    private String remark;
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
    private Long updateTime;
    /**
     *
     */
    private Integer updateBy;
    /**
     *
     */
    private String billFreightItemId;
}