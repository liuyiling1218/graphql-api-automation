package com.hjfruit.test.pitaya.app.entities.v2.api.transfer;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutStockOrderDetailInput {
    /**
     * 入库单ID
     */
    @Needed
    private String outOrderId;
    /**
     * 组织ID
     */
    private Integer orgId;
    /**
     * 系统ID
     */
    private Integer appId;
    /**
     * 操作人可用仓库集合
     */
    private List<String> userWarehouseIdList;
}