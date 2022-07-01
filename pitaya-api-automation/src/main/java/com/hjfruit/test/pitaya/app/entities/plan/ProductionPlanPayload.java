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
 * 生产计划实体
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductionPlanPayload{
    /**
     * 计划id
     */
    private String planId;
    /**
     * 计划单号
     */
    private String planCode;
    /**
     * 计划状态
     */
    private Integer planStatus;
    /**
     * 计划状态名称
     */
    private String planStatusName;
    /**
     * 出库单号
     */
    private String outOrderId;
    /**
     * 产品种类数量
     */
    private Integer categorySum;
    /**
     * 客户id
     */
    private Integer customerId;
    /**
     * 客户名称
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
     * 分公司id
     */
    private Integer organizationId;
    /**
     * 分公司名称
     */
    private String organizationName;
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
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人id
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
     * 总期望数
     */
    private BigDecimal expectNumSum;
    /**
     * 总完成数
     */
    private BigDecimal completedNumSum;
    /**
     * 创建类型
     */
    private Integer createType;
    /**
     * 创建类型名称
     */
    private String createTypeName;
    /**
     * 销售变更提示,0 没有通知  10 通知未读  20 通知已处理  30 通知已忽略
     */
    private Integer saleChangeNotice;
    /**
     * 商品类型
     */
    private Integer commodityType;
    /**
     * 
     */
    private Integer saleCancelCount;
    /**
     * 
     */
    private Integer taskPauses;
}