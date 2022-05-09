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
public class TransferCommodityBillPayload {
    /**
     * 货款单号
     */
    private String billCode;
    /**
     * 备注
     */
    private String remark;
    /**
     * 货款金额总计
     */
    private BigDecimal totalAmount;
    /**
     * 明细数据
     */
    private List<TransferCommodityItemBillPayload> transferCommodityItemBills;
}