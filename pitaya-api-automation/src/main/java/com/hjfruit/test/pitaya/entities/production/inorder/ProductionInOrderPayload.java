package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class ProductionInOrderPayload {
    /**
     * 入库订单id
     */
    private String inOrderId;
    /**
     * 生产任务id
     */
    private String taskId;
    /**
     * 生产任务编号
     */
    private String taskCode;
    /**
     * 入库订单编号
     */
    private String inOrderCode;
    /**
     * 入库订单类型[10:生产入库]
     */
    private Integer inOrderType;
    /**
     * 入库订单类型名称
     */
    private String inOrderTypeName;
    /**
     * 入库订单状态10：待提交20：待入库30：部分入库40：已完成50：已取消';
     */
    private Integer inOrderStatus;
    /**
     * 订单状态名称
     */
    private String inOrderStatusName;
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 客户所属id
     */
    private Integer customerId;
    /**
     * 客户所属名称
     */
    private String customerName;
    /**
     * 客户配送地址id
     */
    private Integer customerDistributionId;
    /**
     * 客户配送地址名称
     */
    private String customerDistributionName;
    /**
     * 分公司id
     */
    private Integer organizationId;
    /**
     * 分公司名称
     */
    private String organizationName;
    /**
     * 仓库id
     */
    private Integer warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 备注信息
     */
    private String inOrderDescription;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人
     */
    private Integer createBy;
    /**
     * 创建人名称
     */
    private String createUserName;
    /**
     * 更新时间
     */
    private Long updateTime;
    /**
     * 更新人id
     */
    private Integer updateBy;
    /**
     * 商品信息
     */
    private List<ProductionInOrderItemPayload> commodities;
    /**
     * 取消订单备注
     */
    private String cancelDescription;
}