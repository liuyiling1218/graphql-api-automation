package com.hjfruit.test.pitaya.app.entities.production.outorder;
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
public class OutOrderPayload{
    /**
     * 出库订单Id
     */
    private String outOrderId;
    /**
     * 出库类型出库订单类型，10：原料领料、20辅料领料 30 成品销售
     */
    private Integer outOrderType;
    /**
     * 出库类型名称
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
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 客户类型 10 无客户 20 客户分组 30 指定客户
     */
    private Integer customerType;
    /**
     * 客户类型翻译
     */
    private String customerTypeName;
    /**
     * 调拨id
     */
    private String transferId;
    /**
     * 调拨类型 10:分拣仓-分拣仓 20:分拣仓-批发
     */
    private Integer transferType;
    /**
     * 调入组织id
     */
    private Integer transferOrganizationId;
    /**
     * 调入组织名称
     */
    private String transferOrganizationName;
    /**
     * 创建用户
     */
    private Integer userId;
    /**
     * 联系电话
     */
    private String createUserPhone;
    /**
     * 客户Id
     */
    private Integer customerId;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 销售时间
     */
    private Long saleTime;
    /**
     * 出库状态Id 出库订单状态，默认待提交，10：待提交、20：待出库、30：部分出库、40：已完成、50：已取消
     */
    private Integer outOrderStatus;
    /**
     * 订单状态翻译
     */
    private String outOrderStatusName;
    /**
     * 仓库Id
     */
    private String warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
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
    private String outOrderDescription;
    /**
     * 
     */
    private String errorDescription;
    /**
     * 商品信息总价
     */
    private BigDecimal totalPrice;
    /**
     * 商品信息
     */
    private List<OutOrderItemPayload> commodityList;
    /**
     * 任务单号
     */
    private String taskCode;
    /**
     * 入库订单Id
     */
    private String inOrderId;
    /**
     * 入库订单编号
     */
    private String inOrderCode;
    /**
     * 供应商Id
     */
    private Integer supplierId;
    /**
     * 供应商名字
     */
    private String supplierName;
    /**
     * 
     */
    private Integer customerDistributionId;
    /**
     * 客户配送地址
     */
    private String customerDistributionName;
    /**
     * 运费 v2.0
     */
    private BigDecimal deliveryFee;
    /**
     * 
     */
    private Integer organizationId;
    /**
     * 
     */
    private String organizationName;
}