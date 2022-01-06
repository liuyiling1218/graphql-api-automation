package com.hjfruit.test.pitaya.app.entities.production.inorder;

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
public class InOrderRecordListPayload {
    /**
     * 入库订单Id
     */
    private String inStockRecordId;
    /**
     * 入库类型
     */
    private Integer inOrderTypeId;
    /**
     * 入库类型名称（原料采购、辅料采购）
     */
    private String inOrderTypeName;
    /**
     * 入库单号
     */
    private String inOrderCode;
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
     * 仓库Id
     */
    private Integer warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 入库人员
     */
    private String createUserName;
    /**
     * 入库时间
     */
    private Long createTime;
    /**
     * 商品信息
     */
    private List<InOrderRecordItemDetailPayload> commodities;
}