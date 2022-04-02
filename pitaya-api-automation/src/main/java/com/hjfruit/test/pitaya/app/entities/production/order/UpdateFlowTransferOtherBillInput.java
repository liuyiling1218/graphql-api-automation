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