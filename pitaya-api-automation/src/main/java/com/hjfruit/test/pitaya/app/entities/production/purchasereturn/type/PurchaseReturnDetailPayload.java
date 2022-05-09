package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.type;

import com.hjfruit.test.pitaya.app.entities.production.common.OutStockOrderType;
import com.hjfruit.test.pitaya.app.entities.production.purchasereturn.common.PurchaseReturnStatus;
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
public class PurchaseReturnDetailPayload {
    /**
     * 退货ID
     */
    private String purchaseReturnId;
    /**
     * 退货编码
     */
    private String purchaseReturnCode;
    /**
     * 采购ID  applyId
     */
    private String purchaseId;
    /**
     * 采购编码
     */
    private String purchaseCode;
    /**
     * 类型
     */
    private OutStockOrderType orderTypeEnum;
    /**
     * 类型描述
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
     * 所属仓库
     */
    private String warehouseId;
    /**
     *
     */
    private String warehouseName;
    /**
     * 商品类型
     */
    private Integer commodityType;
    /**
     *
     */
    private String commodityTypeName;
    /**
     * 供应商
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
     * 备注
     */
    private String note;
    /**
     * 退款合计
     */
    private BigDecimal totalPrice;
    /**
     * 退货商品明细
     */
    private List<PurchaseReturnCommodityDetailPayload> commodityDetail;
    /**
     * 取消原因
     */
    private String cancelNote;
    /**
     * 驳回原因
     */
    private String refuseNote;
    /**
     * 申请操作记录
     */
    private List<PurchaseReturnOperationLogPayload> operationLog;
}