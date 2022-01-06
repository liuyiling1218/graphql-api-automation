package com.hjfruit.test.pitaya.entities.production.inorder;

import com.hjfruit.test.pitaya.entities.production.order.TransferCommodityBillPayload;
import com.hjfruit.test.pitaya.entities.production.order.TransferOtherBillPayload;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
public class TransferBillPayload {
    /**
     * 费用单id
     */
    private String billId;
    /**
     * 调拨申请单id
     */
    private String flowId;
    /**
     * 调拨单号
     */
    private String flowCode;
    /**
     * 出入库订单id
     */
    private String orderId;
    /**
     * 出入库订单编号
     */
    private String orderCode;
    /**
     * 来源id
     */
    private String sourceId;
    /**
     * 调拨申请类型
     */
    private Integer flowType;
    /**
     * 调拨申请类型名称
     */
    private String flowTypeName;
    /**
     * 调拨类型
     */
    private Integer transferType;
    /**
     * 商品类型
     */
    private Integer commodityType;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 调出仓库id
     */
    private Integer sourceWarehouseId;
    /**
     * 调出仓库名称
     */
    private String sourceWarehouseName;
    /**
     * 调出归属类型
     */
    private Integer sourceBelongType;
    /**
     * 调出归属id
     */
    private Integer sourceBelongId;
    /**
     * 调出归属名称
     */
    private String sourceBelongName;
    /**
     * 调入仓库id
     */
    private Integer targetWarehouseId;
    /**
     * 调入仓库名称
     */
    private String targetWarehouseName;
    /**
     * 调入归属类型
     */
    private Integer targetBelongType;
    /**
     * 调入归属id
     */
    private Integer targetBelongId;
    /**
     * 调入归属名称
     */
    private String targetBelongName;
    /**
     * 备注信息
     */
    private String remark;
    /**
     * 调拨申请状态
     */
    private Integer flowStatus;
    /**
     * 调拨申请状态名称
     */
    private String flowStatusName;
    /**
     * 费用状态
     */
    private Integer billStatus;
    /**
     * 费用状态名称
     */
    private String billStatusName;
    /**
     * 调拨订单创建时间
     */
    private Long flowApplyCreateTime;
    /**
     * 调拨订单创建人
     */
    private Integer flowCreateBy;
    /**
     * 调拨订单创建人姓名
     */
    private String flowCreateName;
    /**
     * 出入库时间
     */
    private Long stockUpdateTime;
    /**
     * 出入库操作人
     */
    private Integer stockCreateBy;
    /**
     * 出入库操作人姓名
     */
    private String stockCreateName;
    /**
     * 费用审核人
     */
    private Integer billAuditBy;
    /**
     * 费用审核人姓名
     */
    private String billAuditName;
    /**
     * 调拨商品
     */
    private TransferCommodityBillPayload transferCommodityBills;
    /**
     * 运杂费用
     */
    private TransferOtherBillPayload transferOtherBills;
    /**
     * 驳回原因
     */
    private String refuseNote;
    /**
     * 调出方合计
     */
    private BigDecimal sourceTotalAmount;
    /**
     * 调入方合计
     */
    private BigDecimal targetTotalAmount;
}