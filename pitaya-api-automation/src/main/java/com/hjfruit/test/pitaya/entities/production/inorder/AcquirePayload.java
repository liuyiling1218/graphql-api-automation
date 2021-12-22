package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class AcquirePayload {
    /**
     * 入库订单Id
     */
    private String applyId;
    /**
     * 入库类型
     */
    private Integer applyType;
    /**
     * 入库类型名称（原料采购、辅料采购）
     */
    private String applyTypeName;
    /**
     * 采购单号
     */
    private String applyCode;
    /**
     * 商品类型Id
     */
    private Integer commodityType;
    /**
     * 商品类型名称（原料、辅料）
     */
    private String commodityTypeName;
    /**
     * 客户类型Id
     */
    private Integer belongType;
    /**
     * 客户类型名称
     */
    private String belongTypeName;
    /**
     * 客户Id
     */
    private Integer belongId;
    /**
     * 客户名称
     */
    private String belongName;
    /**
     * 采购订单状态Id '入库订单状态，默认待提交，10：待提交、20：待入库、30：部分入库、40：已完成、50：已取消';
     */
    private Integer applyStatus;
    /**
     * 入库状态
     */
    private String applyStatusName;
    /**
     * 仓库Id
     */
    private Integer warehouseId;
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
     * 创建人员ID
     */
    private Integer createUserId;
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
    private String note;
    /**
     * 驳回（取消）原因
     */
    private String errorDescription;
    /**
     * 总价合计totalPrice:BigDecimal入库记录条数
     */
    private Integer appliedCount;
    /**
     * 采购费用单ID
     */
    private Boolean exitCost;
    /**
     * 商品信息
     */
    private List<AcquireItemPayload> commodities;
    /**
     * 费用信息
     */
    private List<CostItemPayload> costs;
    /**
     * 申请操作记录
     */
    private List<FlowApplyOperationLogPayload> operationLog;
}