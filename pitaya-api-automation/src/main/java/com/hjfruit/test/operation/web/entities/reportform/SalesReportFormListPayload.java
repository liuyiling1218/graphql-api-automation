package com.hjfruit.test.operation.web.entities.reportform;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 列表集合对象
 */
@Data
public class SalesReportFormListPayload {
    /**
     * 主键
     */
    private Long id;
    /**
     * 所属商户
     */
    private String merchant;
    /**
     * 付款类型
     */
    private List<String> payMethod;
    /**
     * 手工单编号
     */
    private String orderCode;
    /**
     * 客户ID
     */
    private Long customerId;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 销售时间
     */
    private Long payTime;
    /**
     * 客户类型
     */
    private String customerType;
    /**
     * SKUID
     */
    private Long productId;
    /**
     * SKU名称
     */
    private String productName;
    /**
     * 批次号
     */
    private String batchStockCode;
    /**
     * 单位
     */
    private String unit;
    /**
     * 数量
     */
    private BigDecimal quantity;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 合计金额
     */
    private BigDecimal totalMoney;
    /**
     * 备注
     */
    private String remark;
    /**
     * 品种组
     */
    private String varietyGroup;
    /**
     * 柜次号
     */
    private String cabinetBatchCode;
    /**
     * 优惠后单价
     */
    private BigDecimal discountUnitPrice;
}