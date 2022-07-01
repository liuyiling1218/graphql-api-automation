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
public class PurchaseOrderPayload{
    /**
     * 入库订单Id
     */
    private String inOrderId;
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
     * 入库状态Id '入库订单状态，默认待提交，10：待提交、20：待入库、30：部分入库、40：已完成、50：已取消';
     */
    private Integer inOrderStatus;
    /**
     * 入库状态
     */
    private String inOrderStatusName;
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
     * 创建人员
     */
    private String createUserName;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 订单备注
     */
    private String inOrderDescription;
    /**
     * 驳回（取消）原因
     */
    private String errorDescription;
    /**
     * 总价合计
     */
    private BigDecimal totalPrice;
    /**
     * 商品信息
     */
    private List<PurchaseOrderItemPayload> commodities;
    /**
     * 销售订单ID
     */
    private String outOrderId;
    /**
     * 销售单号v1.6
     */
    private String saleOrderCode;
    /**
     * 预估运费
     */
    private BigDecimal deliveryFee;
    /**
     * 实际运费v1.7
     */
    private BigDecimal realDeliveryFee;
    /**
     * 是否能进行退货操作v1.7
     */
    private Boolean canReturn;
    /**
     * 调拨组织Id v2.0
     */
    private Integer transferOrganizationId;
    /**
     * 调拨组织名字 v2.0
     */
    private String transferOrganizationName;
    /**
     * 操作人联系电话 v2.0
     */
    private String createUserPhone;
    /**
     * 调拨类型 v2.0
     */
    private Integer transferType;
    /**
     * 调拨ID v2.0
     */
    private String transferId;
    /**
     * 
     */
    private Integer organizationId;
    /**
     * 
     */
    private String organizationName;
}