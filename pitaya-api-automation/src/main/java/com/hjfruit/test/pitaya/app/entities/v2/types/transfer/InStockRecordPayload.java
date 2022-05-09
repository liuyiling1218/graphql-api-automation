package com.hjfruit.test.pitaya.app.entities.v2.types.transfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 入库记录信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InStockRecordPayload {
    /**
     * 入库记录ID
     */
    private Long recordId;
    /**
     * 入库记录编码
     */
    private String recordCode;
    /**
     * 操作人
     */
    private Integer userId;
    /**
     * 所属仓库
     */
    private String warehouseId;
    /**
     * 所属仓库名称
     */
    private String warehouseName;
    /**
     * 备注
     */
    private String note;
    /**
     * 商品类型
     */
    private Integer commodityType;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 所属客户
     */
    private Integer belongId;
    /**
     * 所属客户名称
     */
    private String belongName;
    /**
     * 客户类型
     */
    private Integer belongType;
    /**
     * 供应商
     */
    private Integer supplierId;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 总计金额
     */
    private BigDecimal totalAmount;
    /**
     * 入库商品信息
     */
    private List<StockRecordCommodityPayload> commoditiesList;
}