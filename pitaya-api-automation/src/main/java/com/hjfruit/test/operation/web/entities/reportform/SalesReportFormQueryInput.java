package com.hjfruit.test.operation.web.entities.reportform;

import lombok.Data;

import java.util.List;

/**
 * 列表通用查询入参
 */
@Data
public class SalesReportFormQueryInput {
    /**
     * 商户ID
     */
    private Long merchantId;
    /**
     * 付款类型
     */
    private List<PayMethod> payMethod;
    /**
     * 手工单编号
     */
    private String orderCode;
    /**
     * 批次号
     */
    private String batchStockCode;
    /**
     * 客户类型
     */
    private CustomerType customerType;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 销售时间起
     */
    private Long payStartTime;
    /**
     * 销售时间终
     */
    private Long payEndTime;
}