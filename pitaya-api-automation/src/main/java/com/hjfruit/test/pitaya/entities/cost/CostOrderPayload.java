package com.hjfruit.test.pitaya.entities.cost;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class CostOrderPayload {
    /**
     * 申请id
     */
    private String applyId;
    /**
     * 申请编号（采购单号）
     */
    private String applyCode;
    /**
     * 仓库id
     */
    private Integer warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 供应商id
     */
    private Integer supplierId;
    /**
     * 费用单状态
     */
    private Integer status;
    /**
     * 状态名称
     */
    private String statusName;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 采购人id
     */
    private Integer createBy;
    /**
     * 采购人名称
     */
    private String createName;
    /**
     * 采购时间
     */
    private Long createTime;
    /**
     * 入库时间
     */
    private Long auditTime;
    /**
     * 入库审核人id
     */
    private Integer auditUser;
    /**
     * 入库审核人姓名
     */
    private String auditUserName;
    /**
     * 入库类型
     */
    private Integer commodityType;
    /**
     * 审核人id
     */
    private Integer submitBy;
    /**
     * 审核人姓名
     */
    private String submitName;
    /**
     * 入库类型中文名称
     */
    private String inOrderTypeName;
    /**
     * 货款单号
     */
    private String paymentCode;
    /**
     * 货款总金额
     */
    private BigDecimal paymentActualAmount;
    /**
     * 运杂款总金额
     */
    private BigDecimal freightTotalAmount;
    /**
     * 运杂款单号
     */
    private String freightCode;
    /**
     * 商品明细
     */
    private List<CostCommodityPayload> commodityItems;
    /**
     * 运杂款明细
     */
    private List<FreightCostPayload> freightCostItem;
}