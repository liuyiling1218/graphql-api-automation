package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 已出库商品信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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