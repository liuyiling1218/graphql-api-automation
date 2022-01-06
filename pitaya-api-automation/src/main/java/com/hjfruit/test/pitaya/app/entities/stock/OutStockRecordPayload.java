package com.hjfruit.test.pitaya.app.entities.stock;

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
public class OutStockRecordPayload {
    /**
     *
     */
    private String outStockRecordId;
    /**
     *
     */
    private String outOrderId;
    /**
     *
     */
    private Integer outOrderType;
    /**
     *
     */
    private Integer commodityTypeId;
    /**
     *
     */
    private String commodityTypeName;
    /**
     *
     */
    private BigDecimal totalPrice;
    /**
     *
     */
    private Integer organizationId;
    /**
     *
     */
    private String organizationName;
    /**
     *
     */
    private Integer warehouseId;
    /**
     *
     */
    private String warehouseName;
    /**
     *
     */
    private Integer customerType;
    /**
     *
     */
    private String customerTypeName;
    /**
     *
     */
    private Integer customerId;
    /**
     *
     */
    private String customerName;
    /**
     *
     */
    private String taskCode;
    /**
     *
     */
    private String createUserName;
    /**
     *
     */
    private Long createTime;
    /**
     *
     */
    private Integer createBy;
    /**
     *
     */
    private String outOrderItemId;
    /**
     *
     */
    private String remark;
    /**
     *
     */
    private String outStockCode;
    /**
     *
     */
    private String outOrderCode;
    /**
     *
     */
    private String outOrderTypeName;
    /**
     *
     */
    private BigDecimal deliveryFee;
    /**
     *
     */
    private List<OutStockRecordItemAggPayload> items;
}