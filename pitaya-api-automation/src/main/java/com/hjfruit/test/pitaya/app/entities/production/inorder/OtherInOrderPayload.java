package com.hjfruit.test.pitaya.app.entities.production.inorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherInOrderPayload {
    /**
     * 入库订单Id
     */
    private String inOrderId;
    /**
     * 入库类型
     */
    private Integer inOrderTypeId;
    /**
     * 入库类型名称（原料其他入库、辅料其他入库）
     */
    private String inOrderTypeName;
    /**
     * 入库单号
     */
    private String inOrderCode;
    /**
     * 商品类型Id
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称（原料、辅料）
     */
    private String commodityTypeName;
    /**
     * 客户类型Id
     */
    private Integer customerTypeId;
    /**
     * 客户类型名称
     */
    private String customerTypeName;
    /**
     * 客户Id
     */
    private Integer customerId;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 入库状态Id '入库订单状态，默认待提交，10：待提交、20：待入库、30：部分入库、40：已完成、50：已取消';
     */
    private Integer inOrderStatus;
    /**
     * 入库状态
     */
    private String inOrderStatusName;
    /**
     * 仓库Id
     */
    private String warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 供应商Id
     */
    private Integer supplierId;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 创建人员
     */
    private String createUserName;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 订单备注
     */
    private String inOrderDescription;
    /**
     *
     */
    private String errorDescription;
    /**
     * 总价合计
     */
    private BigDecimal totalPrice;
    /**
     * 商品信息
     */
    private List<OtherInOrderItemPayload> commodities;
    /**
     * 创建人员Id
     */
    private Integer createBy;
}