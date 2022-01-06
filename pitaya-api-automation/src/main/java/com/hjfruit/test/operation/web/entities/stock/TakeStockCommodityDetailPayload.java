package com.hjfruit.test.operation.web.entities.stock;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 盘点商品详情
 */
@Data
public class TakeStockCommodityDetailPayload {
    /**
     * 盘点状态
     */
    private Integer checkStatus;
    /**
     * 入库/出库 单号
     */
    private String stockOrderCode;
    /**
     * 商品名称
     */
    private String commoditySkuName;
    /**
     * 系统库存
     */
    private BigDecimal unitQuantity;
    /**
     * 盘点库存
     */
    private BigDecimal checkUnitQuantity;
    /**
     * 1:盘盈 2:盘亏 3:正常
     */
    private Integer orderType;
    /**
     * 异常原因
     */
    private String remark;
    /**
     * 批次号
     */
    private String batchCode;
    /**
     * skuId
     */
    private Integer skuId;
    /**
     * 溯源批次号
     */
    private String originalBatchCode;
}