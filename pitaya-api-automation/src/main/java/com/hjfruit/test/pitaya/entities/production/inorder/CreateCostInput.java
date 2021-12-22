package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class CreateCostInput {
    /**
     * 费用类型
     */
    @Needed
    private Integer typeId;
    /**
     * 供应商名称
     */
    @Needed
    private String supplierName;
    /**
     * 金额
     */
    @Needed
    private BigDecimal amount;
    /**
     * 备注
     */
    private String note;
}