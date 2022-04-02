package com.hjfruit.test.pitaya.app.entities.production.order;

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
public class TransferOrderPayload {
    /**
     * 调拨订单id
     */
    private String flowId;
    /**
     * 调拨单号
     */
    private String flowCode;
    /**
     * 调拨申请类型
     */
    private Integer flowType;
    /**
     * 调拨申请类型名称
     */
    private String flowTypeName;
    /**
     * 调拨类型（10 仓库间调拨，20 跨组织调拨，30库存退货，40库存借调）
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
     * 调出仓库Id
     */
    private String sourceWarehouseId;
    /**
     * 调出仓库名称
     */
    private String sourceWarehouseName;
    /**
     * 调出归属id
     */
    private Integer sourceBelongId;
    /**
     * 调出归属名称
     */
    private String sourceBelongName;
    /**
     * 调入仓库Id
     */
    private String targetWarehouseId;
    /**
     * 调入仓库名称
     */
    private String targetWarehouseName;
    /**
     * 调入归属id
     */
    private Integer targetBelongId;
    /**
     * 调入归属名称
     */
    private String targetBelongName;
    /**
     * 订单备注
     */
    private String flowRemark;
    /**
     * 订单状态
     */
    private Integer flowStatus;
    /**
     * 入库状态
     */
    private String flowStatusName;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人员
     */
    private Integer createBy;
    /**
     * 创建人员姓名
     */
    private String createUserName;
    /**
     * 操作人联系电话
     */
    private String createUserPhone;
    /**
     * 修改人员
     */
    private Integer updateBy;
    /**
     * 修改人员姓名
     */
    private String updateUserName;
    /**
     * 修改时间
     */
    private Long updateTime;
    /**
     * 调拨商品
     */
    private List<TransferCommodityItemBillPayload> transferCommodityItemBills;
    /**
     * 运杂费用
     */
    private List<TransferOtherItemBillPayload> transferOtherItemBills;
    /**
     * 总货款
     */
    private BigDecimal totalGoodsFee;
    /**
     * 总运杂款
     */
    private BigDecimal totalTransportFees;
    /**
     * 费用id
     */
    private String billId;
    /**
     * 费用状态
     */
    private Integer billStatus;
    /**
     * 费用状态名称
     */
    private String billStatusName;
    /**
     * 调拨驳回/取消原因
     */
    private String reason;
    /**
     * 调拨去向筛选 10 分拣仓-分拣仓 20批发-分拣仓 30分拣仓-批发
     */
    private Integer direction;
    /**
     *
     */
    private Integer sourceAppId;
    /**
     *
     */
    private Integer targetAppId;
}