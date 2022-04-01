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
public class AuditOutOrder {
    /**
     * 出库订单Id
     */
    private String outOrderId;
    /**
     * 出库类型
     */
    private Integer outOrderTypeId;
    /**
     * 出库类型名称
     */
    private String outOrderTypeName;
    /**
     * 出库单号
     */
    private String outOrderCode;
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
     * 客户分组Id
     */
    private Integer customerGroupId;
    /**
     * 客户分组名称
     */
    private String customerGroupName;
    /**
     * 出库状态Id
     */
    private Integer outOrderStatusId;
    /**
     * 出库状态
     */
    private String outOrderStatus;
    /**
     * 仓库Id
     */
    private Integer warehouseId;
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
    private String createTime;
    /**
     * 订单备注
     */
    private String outOrderDescription;
    /**
     * 商品信息
     */
    private List<AuditOrderItem> commodities;
    /**
     * 总计
     */
    private String totalPrice;
}