package com.hjfruit.test.pitaya.app.entities.cost;

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
public class UpdateFreightCostInput {
    /**
     * 供应商ID
     */
    private Integer supplierId;
    /**
     * 费用类型id
     */
    private Integer typeId;
    /**
     * 金额
     */
    private BigDecimal amount;
    /**
     * 备注
     */
    private String note;
    /**
     * 支付方式 10月结 20半月结 30次结
     */
    private Integer payMode;
}