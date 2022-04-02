package com.hjfruit.test.pitaya.app.entities.production.inorder;

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
public class InOrderRecordDetailPayload {
    /**
     * 入库订单Id
     */
    private String inStockRecordId;
    /**
     * 入库类型
     */
    private Integer inOrderTypeId;
    /**
     * 入库类型名称
     */
    private String inOrderTypeName;
    /**
     * 入库单号
     */
    private String inOrderCode;
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
     * 入库状态Id
     */
    private Integer inOrderStatusId;
    /**
     * 入库状态
     */
    private String inOrderStatus;
    /**
     * 仓库Id
     */
    private String warehouseId;
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
     * 订单备注
     */
    private String inOrderDescription;
    /**
     * 商品信息
     */
    private List<InOrderRecordItemDetailPayload> commodities;
    /**
     * 总计
     */
    private BigDecimal totalPrice;
    /**
     * 提交人员
     */
    private String submitUserName;
    /**
     * 提交时间
     */
    private Long submitTime;
    /**
     * 入库人员
     */
    private String putInUserName;
    /**
     * 入库时间
     */
    private Long putInTime;
    /**
     * 实际运费
     */
    private BigDecimal deliveryFee;
}