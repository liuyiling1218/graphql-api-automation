package com.hjfruit.test.pitaya.app.entities.production.inorder;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;
import java.math.BigDecimal;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.annotation.NotEmpty;
import com.hjfruit.test.pitaya.app.entities.stock.*;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.apply.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.type.*;
import com.hjfruit.test.pitaya.app.entities.user.*;
import com.hjfruit.test.pitaya.app.entities.base.user.*;
import com.hjfruit.test.pitaya.app.entities.convert.type.*;
import com.hjfruit.test.pitaya.app.entities.base.store.*;
import com.hjfruit.test.pitaya.app.entities.label.*;
import com.hjfruit.test.pitaya.app.entities.convert.api.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.transfer.*;
import com.hjfruit.test.pitaya.app.entities.production.common.*;
import com.hjfruit.test.pitaya.app.entities.common.*;
import com.hjfruit.test.pitaya.app.entities.push.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.api.*;
import com.hjfruit.test.pitaya.app.entities.statistics.type.*;
import com.hjfruit.test.pitaya.app.entities.base.supplier.*;
import com.hjfruit.test.pitaya.app.entities.statistics.api.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.type.*;
import com.hjfruit.test.pitaya.app.entities.secondment.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.transfer.*;
import com.hjfruit.test.pitaya.app.entities.plan.*;
import com.hjfruit.test.pitaya.app.entities.production.order.*;
import com.hjfruit.test.pitaya.app.entities.base.customer.*;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.type.*;
import com.hjfruit.test.pitaya.app.entities.base.app.*;
import com.hjfruit.test.pitaya.app.entities.base.config.*;
import com.hjfruit.test.pitaya.app.entities.*;
import com.hjfruit.test.pitaya.app.entities.check.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import com.hjfruit.test.pitaya.app.entities.statistics.*;
import com.hjfruit.test.pitaya.app.entities.v2.common.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.*;
import com.hjfruit.test.pitaya.app.entities.cost.common.*;
import com.hjfruit.test.pitaya.app.entities.production.task.*;
import com.hjfruit.test.pitaya.app.entities.base.location.*;
import com.hjfruit.test.pitaya.app.entities.org.*;
/**
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransferBillPayload{
    /**
     * 费用单id
     */
    private String billId;
    /**
     * 调拨申请单id
     */
    private String flowId;
    /**
     * 调拨单号
     */
    private String flowCode;
    /**
     * 出入库订单id
     */
    private String orderId;
    /**
     * 出入库订单编号
     */
    private String orderCode;
    /**
     * 来源id
     */
    private String sourceId;
    /**
     * 来源APP
     */
    private Integer sourceAppId;
    /**
     * 调拨申请类型
     */
    private Integer flowType;
    /**
     * 调拨申请类型名称
     */
    private String flowTypeName;
    /**
     * 调拨类型
     */
    private Integer transferType;
    /**
     * 商品类型
     */
    private Integer commodityType;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 调出仓库id
     */
    private String sourceWarehouseId;
    /**
     * 调出仓库名称
     */
    private String sourceWarehouseName;
    /**
     * 调出归属类型
     */
    private Integer sourceBelongType;
    /**
     * 调出归属id
     */
    private Integer sourceBelongId;
    /**
     * 调出归属名称
     */
    private String sourceBelongName;
    /**
     * 调入仓库id
     */
    private String targetWarehouseId;
    /**
     * 调入仓库名称
     */
    private String targetWarehouseName;
    /**
     * 调入归属类型
     */
    private Integer targetBelongType;
    /**
     * 调入归属id
     */
    private Integer targetBelongId;
    /**
     * 调入归属名称
     */
    private String targetBelongName;
    /**
     * 备注信息
     */
    private String remark;
    /**
     * 调拨申请状态
     */
    private Integer flowStatus;
    /**
     * 调拨申请状态名称
     */
    private String flowStatusName;
    /**
     * 
     */
    private BillStatusEnum billStatus;
    /**
     * 费用状态
     */
    private Integer billStatusCode;
    /**
     * 费用状态名称
     */
    private String billStatusName;
    /**
     * 调拨订单创建时间
     */
    private Long flowApplyCreateTime;
    /**
     * 调拨订单创建人
     */
    private Integer flowCreateBy;
    /**
     * 调拨订单创建人姓名
     */
    private String flowCreateName;
    /**
     * 出入库时间
     */
    private Long stockUpdateTime;
    /**
     * 出入库操作人
     */
    private Integer stockCreateBy;
    /**
     * 出入库操作人姓名
     */
    private String stockCreateName;
    /**
     * 出入库审核人
     */
    private Integer stockAuditUser;
    /**
     * 出入库审核人
     */
    private String stockAuditUserName;
    /**
     * 费用审核人
     */
    private Integer billAuditBy;
    /**
     * 费用审核人姓名
     */
    private String billAuditName;
    /**
     * 调拨商品
     */
    private TransferCommodityBillPayload transferCommodityBill;
    /**
     * 运杂费用
     */
    private TransferOtherBillPayload transferOtherBill;
    /**
     * 驳回原因
     */
    private String refuseNote;
    /**
     * 调出方合计
     */
    private BigDecimal sourceTotalAmount;
    /**
     * 调入方合计
     */
    private BigDecimal targetTotalAmount;
    /**
     * 
     */
    private Long recordUpdateTime;
}