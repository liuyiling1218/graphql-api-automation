package com.hjfruit.test.pitaya.app.entities.production.outorder;

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
public class OutboundRecordItem {
    /**
     * SPU名称
     */
    private String commodityName;
    /**
     * 规格选项
     */
    private List<String> skuTextDescription;
    /**
     * 小单位类型名称
     */
    private String unitTypeName;
    /**
     * 副单位类型名称
     */
    private String totalTypeName;
    /**
     * 单价
     */
    private String unitPrice;
    /**
     * 单价单位名称
     */
    private String unitPriceTypeName;
    /**
     * 总价
     */
    private String totalPrice;
    /**
     * 周转筐数量
     */
    private String basketQuantity;
    /**
     * 周转筐归属
     */
    private String basketCustomerName;
    /**
     * 批次等信息
     */
    private List<OutboundBatchItem> outboundBatchItem;
}