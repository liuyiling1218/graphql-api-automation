package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
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
}