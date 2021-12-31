package com.hjfruit.test.pitaya.entities.production.order;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class UpdateFlowTransferOtherBillInput {
    /**
     * 调拨申请id
     */
    private String flowId;
    /**
     * 费用单id
     */
    private String billId;
    /**
     * 运杂款明细
     */
    private List<FlowTransferOtherBillInput> flowTransferOtherBillReqList;
}