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
public class OutOrderRecordDetail {
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
     * 仓库Id
     */
    private String warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 订单备注
     */
    private String outOrderDescription;
    /**
     * 商品信息
     */
    private List<OutOrderRecordItemDetail> commodities;
    /**
     * 总计
     */
    private String totalPrice;
    /**
     * 提交人员
     */
    private String submitUserName;
    /**
     * 提交时间
     */
    private String submitTime;
    /**
     * 出库人员
     */
    private String putInUserName;
    /**
     * 出库时间
     */
    private String putInTime;
}