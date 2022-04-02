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
public class ProductionOutOrderPayload {
    /**
     * 出库订单id
     */
    private String outOrderId;
    /**
     * 生产任务id
     */
    private String taskId;
    /**
     * 生产任务编号
     */
    private String taskCode;
    /**
     * 出库订单编号
     */
    private String outOrderCode;
    /**
     * 出库订单类型[10：原料领料出库、20：辅料领料出库]
     */
    private Integer outOrderType;
    /**
     * 出库订单类型名称
     */
    private String outOrderTypeName;
    /**
     * 出库订单状态10：待提交15：待审核16: 生产中20：待出库30：部分出库40：已完成50：已取消';
     */
    private Integer outOrderStatus;
    /**
     * 订单状态名称
     */
    private String outOrderStatusName;
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 客户类型
     */
    private Integer customerType;
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
    private String warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 备注信息
     */
    private String outOrderDescription;
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
    private List<ProductionOutOrderDetailPayload> commodities;
    /**
     * 取消订单备注
     */
    private String cancelDescription;
}