package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutOrderRecordList {
    /**
     * 出库订单Id
     */
    private String outOrderId;
    /**
     * 出库类型
     */
    private Integer outOrderTypeId;
    /**
     * 出库类型名称（原料采购、辅料采购）
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
     * 商品类型名称（原料、辅料）
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
    private Integer warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 出库人员
     */
    private String createUserName;
    /**
     * 出库时间
     */
    private String createTime;
}