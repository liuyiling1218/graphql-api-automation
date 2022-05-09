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
public class AuditInOrderPayload {
    /**
     * 入库订单Id
     */
    private String inOrderId;
    /**
     * 入库类型
     */
    private Integer inOrderTypeId;
    /**
     * 入库类型名称
     */
    private String inOrderTypeName;
    /**
     * 入库单号
     */
    private String inOrderCode;
    /**
     * 任务Id
     */
    private String taskId;
    /**
     * 任务单号
     */
    private String taskCode;
    /**
     * 商品类型Id
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
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
     * 入库状态Id
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
     * 调拨id
     */
    private String transferId;
    /**
     * 调拨类型 10:分拣仓-分拣仓 20:分拣仓-批发
     */
    private Integer transferType;
    /**
     * 调出组织id
     */
    private Integer transferOrganizationId;
    /**
     * 调出组织名称
     */
    private String transferOrganizationName;
    /**
     * 创建人员
     */
    private String createUserName;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 联系电话
     */
    private String createUserPhone;
    /**
     * 订单备注
     */
    private String inOrderDescription;
    /**
     * 商品信息
     */
    private List<AuditInOrderItemPayload> commodities;
    /**
     * 总计
     */
    private BigDecimal totalPrice;
    /**
     * 预估运费
     */
    private BigDecimal deliveryFee;
    /**
     * 客户配送地址
     */
    private String customerDistributionName;
}