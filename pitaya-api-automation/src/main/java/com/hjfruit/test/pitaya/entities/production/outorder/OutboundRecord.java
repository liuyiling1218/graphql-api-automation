package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.util.List;

/**
 * 已出库商品信息
 */
@Data
public class OutboundRecord {
    /**
     * 已出库商品信息
     */
    private List<OutboundRecordItem> outboundRecordItems;
    /**
     * 总价
     */
    private String totalPrice;
    /**
     * 出库单号
     */
    private String outOrderCode;
    /**
     * 出库人员
     */
    private String createUserName;
    /**
     * 出库时间
     */
    private String outboundTime;
}