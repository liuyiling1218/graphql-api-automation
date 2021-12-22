package com.hjfruit.test.pitaya.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 采购列表条件
 */
@Data
public class CountSaleReturnInput {
    /**
     * 退货时间
     */
    @Needed
    private Long createTime;
    /**
     * 入库类型
     */
    @Needed
    private Integer inOrderTypeId;
}