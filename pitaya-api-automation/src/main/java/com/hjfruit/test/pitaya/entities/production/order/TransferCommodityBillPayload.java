package com.hjfruit.test.pitaya.entities.production.order;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
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