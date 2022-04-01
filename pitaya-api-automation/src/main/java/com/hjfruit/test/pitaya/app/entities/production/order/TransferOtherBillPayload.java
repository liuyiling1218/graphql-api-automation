package com.hjfruit.test.pitaya.app.entities.production.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferOtherBillPayload {
    /**
     * 运杂单id
     */
    private String billItemId;
    /**
     * 运杂费单号
     */
    private String billCode;
    /**
     * 运杂款金额合计
     */
    private BigDecimal totalAmount;
    /**
     * 运杂费明细列表
     */
    private List<TransferOtherItemBillPayload> transferOrderFeeItems;
}