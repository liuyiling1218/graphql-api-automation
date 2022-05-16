package com.hjfruit.test.pitaya.app.entities.v2.api.transfer;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 入库请求
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryOutRecordListInput {
    /**
     * 用户ID
     */
    private Integer userId;
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
    /**
     * 业务ID
     */
    private String businessId;
    /**
     * 出库单ID
     */
    @Needed
    private String outOrderId;
}