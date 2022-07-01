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
public class ProductionInOrderPayload{
    /**
     * 入库订单id
     */
    private String inOrderId;
    /**
     * 生产任务id
     */
    private String taskId;
    /**
     * 生产任务编号
     */
    private String taskCode;
    /**
     * 入库订单编号
     */
    private String inOrderCode;
    /**
     * 入库订单类型[10:生产入库]
     */
    private Integer inOrderType;
    /**
     * 入库订单类型名称
     */
    private String inOrderTypeName;
    /**
     * 入库订单状态10：待提交20：待入库30：部分入库40：已完成50：已取消';
     */
    private Integer inOrderStatus;
    /**
     * 订单状态名称
     */
    private String inOrderStatusName;
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 客户所属id
     */
    private Integer customerId;
    /**
     * 客户所属名称
     */
    private String customerName;
    /**
     * 客户配送地址id
     */
    private Integer customerDistributionId;
    /**
     * 客户配送地址名称
     */
    private String customerDistributionName;
    /**
     * 分公司id
     */
    private Integer organizationId;
    /**
     * 分公司名称
     */
    private String organizationName;
    /**
     * 仓库id
     */
    private String warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 备注信息
     */
    private String inOrderDescription;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人
     */
    private Integer createBy;
    /**
     * 创建人名称
     */
    private String createUserName;
    /**
     * 更新时间
     */
    private Long updateTime;
    /**
     * 更新人id
     */
    private Integer updateBy;
    /**
     * 商品信息
     */
    private List<ProductionInOrderItemPayload> commodities;
    /**
     * 
     */
    private String cancelDescription;
}