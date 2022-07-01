package com.hjfruit.test.pitaya.app.entities.plan;
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
 * 生产计划详情
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductionPlanDetailPayload{
    /**
     * 计划id
     */
    private String planId;
    /**
     * 订单号
     */
    private String planCode;
    /**
     * 销售单号
     */
    private String outOrderId;
    /**
     * 任务状态ID
     */
    private Integer planStatus;
    /**
     * 任务状态名称
     */
    private String planStatusName;
    /**
     * 
     */
    private Integer customerType;
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
     * 仓库id
     */
    private String warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 生产日期
     */
    private Long planDate;
    /**
     * 计划开始时间
     */
    private Long planStartTime;
    /**
     * 计划结束时间
     */
    private Long planEndTime;
    /**
     * 备注
     */
    private String planDescription;
    /**
     * 生产计划日志备注
     */
    private String planLogDescription;
    /**
     * 成品销售创建计划:10 手动创建计划:20
     */
    private Integer createType;
    /**
     * 创建类型名称
     */
    private String createTypeName;
    /**
     * 商品类型
     */
    private Integer commodityType;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
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
     * 计划任务信息
     */
    private List<TaskPayload> task;
}