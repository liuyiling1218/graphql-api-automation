package com.hjfruit.test.operation.web.entities.reportform;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 列表集合对象
 */
@Data
public class OutBoundReportFormListPayload {
    /**
     * 主键
     */
    private Long id;
    /**
     * 出库单号
     */
    private String outboundCode;
    /**
     * 批次号
     */
    private String batchStockCode;
    /**
     * 所属商户
     */
    private String merchant;
    /**
     * 所属仓库
     */
    private String repository;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 出库类型
     */
    private String outboundType;
    /**
     * 数量
     */
    private BigDecimal quantity;
    /**
     * 数量单位
     */
    private String unit;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 小计
     */
    private BigDecimal totalAmount;
    /**
     * 出库时间
     */
    private Long outboundTime;
    /**
     * 调拨单id
     */
    private Integer allocateCostId;
}