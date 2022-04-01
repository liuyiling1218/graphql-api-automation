package com.hjfruit.test.pitaya.app.entities.production.order;

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