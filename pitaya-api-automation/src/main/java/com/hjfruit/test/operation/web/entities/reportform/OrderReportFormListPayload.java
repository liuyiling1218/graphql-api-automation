package com.hjfruit.test.operation.web.entities.reportform;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 列表集合对象
 */
@Data
public class OrderReportFormListPayload {
    /**
     * 主键
     */
    private Long id;
    /**
     * 订单号
     */
    private String orderCode;
    /**
     * 商品及数量
     */
    private List<ProductObj> productAndCount;
    /**
     * 所属商户
     */
    private String merchant;
    /**
     * 客户类型
     */
    private String customerType;
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
     * 总数量
     */
    private BigDecimal totalQuantity;
    /**
     * 应收金额
     */
    private BigDecimal totalMoney;
    /**
     * 实收金额
     */
    private BigDecimal receivableMoney;
    /**
     * 优惠金额
     */
    private BigDecimal discountMoney;
    /**
     * 现金支付金额
     */
    private BigDecimal cashMoney;
    /**
     * 微信金额
     */
    private BigDecimal wechatMoney;
    /**
     * 支付宝金额
     */
    private BigDecimal alipayMoney;
    /**
     * 内部欠款
     */
    private BigDecimal internalArrearsMoney;
    /**
     * 外部欠款
     */
    private BigDecimal externalArrearsMoney;
    /**
     * 转账
     */
    private BigDecimal transferAccountsMoney;
    /**
     * 刷卡
     */
    private BigDecimal swipeMoney;
    /**
     * 支付方式
     */
    private List<String> payMethod;
    /**
     * 原支付方式
     */
    private List<String> oldPayMethod;
    /**
     * 开单时间
     */
    private Long billingTime;
    /**
     * 支付时间
     */
    private Long payTime;
    /**
     * 订单备注
     */
    private String remark;
    /**
     * 收银备注
     */
    private String cashRemark;
    /**
     * 退货订单ID
     */
    private Integer returnOrderId;
    /**
     * 退货订单号
     */
    private String returnOrderCode;
    /**
     * 订单状态
     */
    private String statusDesc;
}