package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleOrderPayload {
    /**
     * 出库订单Id
     */
    private String outOrderId;
    /**
     * 出库类型出库订单类型，10：原料领料、20辅料领料 30 成品销售
     */
    private Integer outOrderType;
    /**
     * 出库类型名称
     */
    private String outOrderTypeName;
    /**
     * 出库单号
     */
    private String outOrderCode;
    /**
     * 商品类型Id
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 客户类型 10 无客户 20 客户分组 30 指定客户
     */
    private Integer customerType;
    /**
     * 客户类型翻译
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
     * 销售时间
     */
    private Long saleTime;
    /**
     * 出库状态Id 出库订单状态，默认待提交，10：待提交、20：待出库、30：部分出库、40：已完成、50：已取消
     */
    private Integer outOrderStatus;
    /**
     * 订单状态翻译
     */
    private String outOrderStatusName;
    /**
     * 仓库Id
     */
    private String warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
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
    private String outOrderDescription;
    /**
     * 驳回（取消）原因
     */
    private String errorDescription;
    /**
     *
     */
    private Integer customerDistributionId;
    /**
     *
     */
    private String customerDistributionName;
    /**
     * 商品信息
     */
    private List<SaleOrderItemPayload> commodityList;
    /**
     * 退货申请数量 v1.6
     */
    private Integer countReturnApply;
    /**
     * 是否能操作 可操作返回true v1.6
     */
    private Boolean canSaleReturn;
    /**
     *
     */
    private Integer rejectCount;
}