package com.hjfruit.test.pitaya.app.entities.production.inorder;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 采购列表条件
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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