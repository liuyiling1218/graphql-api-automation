package com.hjfruit.test.pitaya.entities.check;

import lombok.Data;

/**
 *
 */
@Data
public class StockCheckPayload {
    /**
     * 记录id
     */
    private Integer checkRecordId;
    /**
     * 订单id
     */
    private Integer orderId;
    /**
     * 盘点类型
     */
    private Integer checkType;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 批次号
     */
    private String batchNo;
    /**
     * 规格字符串，由后端组装
     */
    private String specOption;
    /**
     * 库存数量
     */
    private Float unitQuantity;
    /**
     * 盘点库存数量
     */
    private Float checkUnitQuantity;
    /**
     * 库存单位
     */
    private String unitName;
    /**
     * 库存总计数量
     */
    private Float totalQuantity;
    /**
     * 盘点库存总计数量
     */
    private Float checkTotalQuantity;
    /**
     * 总计数量单位
     */
    private String totalName;
    /**
     * 备注
     */
    private String remark;
}