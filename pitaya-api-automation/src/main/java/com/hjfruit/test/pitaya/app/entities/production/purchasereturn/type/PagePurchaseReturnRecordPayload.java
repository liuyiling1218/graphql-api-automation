package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.type;

import com.hjfruit.test.pitaya.app.entities.production.common.OutStockOrderType;
import com.hjfruit.test.pitaya.app.entities.production.purchasereturn.common.PurchaseReturnStatus;
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
public class PagePurchaseReturnRecordPayload {
    /**
     * 采购退货ID
     */
    private String purchaseReturnId;
    /**
     * 采购退货单号
     */
    private String purchaseReturnCode;
    /**
     * 类型 默认
     */
    private OutStockOrderType orderTypeEnum;
    /**
     * 类型描述 默认
     */
    private String orderTypeDesc;
    /**
     * 采购退货状态
     */
    private PurchaseReturnStatus status;
    /**
     * 采购退货状态描述
     */
    private String statusDesc;
    /**
     * 所属仓库ID
     */
    private Integer warehouseId;
    /**
     *
     */
    private String warehouseName;
    /**
     * 供应商ID
     */
    private Integer supplierId;
    /**
     *
     */
    private String supplierName;
    /**
     * 所属客户
     */
    private Integer belongId;
    /**
     * 所属客户类型
     */
    private Integer belongType;
    /**
     *
     */
    private String belongName;
    /**
     * 商品类型
     */
    private Integer commodityType;
    /**
     *
     */
    private String commodityTypeName;
    /**
     * 创建人
     */
    private Integer createUserId;
    /**
     *
     */
    private String createUserName;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 商品信息
     */
    private List<PurchaseReturnCommodityPayload> commodity;
}