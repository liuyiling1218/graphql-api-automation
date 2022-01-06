package com.hjfruit.test.pitaya.entities.production.order;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class UpdateFlowTransferCommodityBillInput {
    /**
     * 调拨申请id
     */
    private String flowId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 货款明细
     */
    private List<UpdateFlowTransferCommodityItemInput> updateFlowTransferCommodityItemReqList;
}