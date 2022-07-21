package com.hjfruit.test.pitaya.app.entities.production.order;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;
import java.math.BigDecimal;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.annotation.NotEmpty;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.app.entities.delivery.bill.api.*;
import com.hjfruit.test.pitaya.app.entities.user.*;
import com.hjfruit.test.pitaya.app.entities.label.*;
import com.hjfruit.test.pitaya.app.entities.convert.api.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.transfer.*;
import com.hjfruit.test.pitaya.app.entities.delivery.bill.type.*;
import com.hjfruit.test.pitaya.app.entities.production.common.*;
import com.hjfruit.test.pitaya.app.entities.common.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.api.*;
import com.hjfruit.test.pitaya.app.entities.statistics.type.*;
import com.hjfruit.test.pitaya.app.entities.production.inorder.api.*;
import com.hjfruit.test.pitaya.app.entities.statistics.api.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.type.*;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.type.*;
import com.hjfruit.test.pitaya.app.entities.base.config.*;
import com.hjfruit.test.pitaya.app.entities.delivery.order.type.*;
import com.hjfruit.test.pitaya.app.entities.*;
import com.hjfruit.test.pitaya.app.entities.statistics.*;
import com.hjfruit.test.pitaya.app.entities.production.task.*;
import com.hjfruit.test.pitaya.app.entities.stock.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.apply.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.type.*;
import com.hjfruit.test.pitaya.app.entities.base.user.*;
import com.hjfruit.test.pitaya.app.entities.convert.type.*;
import com.hjfruit.test.pitaya.app.entities.base.store.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.*;
import com.hjfruit.test.pitaya.app.entities.push.*;
import com.hjfruit.test.pitaya.app.entities.base.supplier.*;
import com.hjfruit.test.pitaya.app.entities.secondment.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.transfer.*;
import com.hjfruit.test.pitaya.app.entities.plan.*;
import com.hjfruit.test.pitaya.app.entities.production.order.*;
import com.hjfruit.test.pitaya.app.entities.delivery.order.api.*;
import com.hjfruit.test.pitaya.app.entities.base.customer.*;
import com.hjfruit.test.pitaya.app.entities.production.inorder.type.*;
import com.hjfruit.test.pitaya.app.entities.base.app.*;
import com.hjfruit.test.pitaya.app.entities.check.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import com.hjfruit.test.pitaya.app.entities.v2.common.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.*;
import com.hjfruit.test.pitaya.app.entities.cost.common.*;
import com.hjfruit.test.pitaya.app.entities.base.location.*;
import com.hjfruit.test.pitaya.app.entities.org.*;
/**
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransferOrderPayload{
    /**
     * 调拨订单id
     */
    private String flowId;
    /**
     * 调拨单号
     */
    private String flowCode;
    /**
     * 调拨申请类型
     */
    private Integer flowType;
    /**
     * 调拨申请类型名称
     */
    private String flowTypeName;
    /**
     * 调拨类型（10 仓库间调拨，20 跨组织调拨，30库存退货，40库存借调）
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
     * 调出仓库Id
     */
    private String sourceWarehouseId;
    /**
     * 调出仓库名称
     */
    private String sourceWarehouseName;
    /**
     * 调出归属id
     */
    private Integer sourceBelongId;
    /**
     * 调出归属名称
     */
    private String sourceBelongName;
    /**
     * 调入仓库Id
     */
    private String targetWarehouseId;
    /**
     * 调入仓库名称
     */
    private String targetWarehouseName;
    /**
     * 调入归属id
     */
    private Integer targetBelongId;
    /**
     * 调入归属名称
     */
    private String targetBelongName;
    /**
     * 订单备注
     */
    private String flowRemark;
    /**
     * 订单状态
     */
    private Integer flowStatus;
    /**
     * 入库状态
     */
    private String flowStatusName;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人员
     */
    private Integer createBy;
    /**
     * 创建人员姓名
     */
    private String createUserName;
    /**
     * 操作人联系电话
     */
    private String createUserPhone;
    /**
     * 修改人员
     */
    private Integer updateBy;
    /**
     * 修改人员姓名
     */
    private String updateUserName;
    /**
     * 修改时间
     */
    private Long updateTime;
    /**
     * 调拨商品
     */
    private List<TransferCommodityItemBillPayload> transferCommodityItemBills;
    /**
     * 运杂费用
     */
    private List<TransferOtherItemBillPayload> transferOtherItemBills;
    /**
     * 总货款
     */
    private BigDecimal totalGoodsFee;
    /**
     * 总运杂款
     */
    private BigDecimal totalTransportFees;
    /**
     * 费用id
     */
    private String billId;
    /**
     * 费用状态
     */
    private Integer billStatus;
    /**
     * 费用状态名称
     */
    private String billStatusName;
    /**
     * 
     */
    private String reason;
    /**
     * 调拨去向筛选 10 分拣仓-分拣仓 20批发-分拣仓 30分拣仓-批发
     */
    private Integer direction;
    /**
     * 
     */
    private Integer sourceAppId;
    /**
     * 
     */
    private Integer targetAppId;
}