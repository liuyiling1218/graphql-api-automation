package com.hjfruit.test.pitaya.app.entities.production.inorder;

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
public class CostItemPayload {
    /**
     * 费用类型
     */
    private Integer typeId;
    /**
     * 费用类型名称
     */
    private String typeName;
    /**
     * 供应商信息
     */
    private String supplierName;
    /**
     * 金额
     */
    private BigDecimal amount;
    /**
     * 备注
     */
    private String note;
    /**
     * 供应商Id
     */
    private Integer supplierId;
    /**
     * 付款方式Id
     */
    private Integer payMode;
    /**
     * 付款方式名字
     */
    private String payModeName;
}