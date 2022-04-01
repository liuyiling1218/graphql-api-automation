package com.hjfruit.test.operation.web.entities.reportform;

import lombok.Data;

import java.util.List;

/**
 * 列表通用查询入参
 */
@Data
public class OrderReportFormQueryInput {
    /**
     * 商户ID
     */
    private Long merchantId;
    /**
     * 订单号
     */
    private String orderCode;
    /**
     * 客户类型
     */
    private CustomerType customerType;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 销售员
     */
    private String salesmanName;
    /**
     * 收银员
     */
    private String cashierName;
    /**
     * 支付方式
     */
    private List<PayMethod> payMethod;
    /**
     * 支付时间起
     */
    private Long payStartTime;
    /**
     * 支付时间终
     */
    private Long payEndTime;
    /**
     * 订单状态
     */
    private OrderReportQueryStatus status;
}