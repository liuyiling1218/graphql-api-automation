package com.hjfruit.test.pitaya.app.entities.production.task;
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
 * 生产任务明细
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskItem{
    /**
     * 生产任务明细id
     */
    private String taskItemId;
    /**
     * 生产计划id
     */
    private String planId;
    /**
     * 生产任务id
     */
    private String taskId;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * bom id
     */
    private Integer commodityBomId;
    /**
     * 商品sku id
     */
    private Integer commoditySkuId;
    /**
     * 商品规格选项id
     */
    private List<Integer> commoditySpecOptionId;
    /**
     * sku文字描述，规格选项文字数组
     */
    private List<String> skuTextDescription;
    /**
     * 期望数量
     */
    private BigDecimal expectNum;
    /**
     * 已生产数量，默认0
     */
    private BigDecimal completedNum;
    /**
     * 单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 单位类型
     */
    private Integer unitType;
    /**
     * 单位类型名称
     */
    private String unitTypeName;
    /**
     * 总计类型
     */
    private Integer totalType;
    /**
     * 总计类型名称
     */
    private String totalTypeName;
    /**
     * 变更通知,0 没有通知  10 通知未读  20 通知已处理  30 通知已忽略
     */
    private Integer planChangeNotice;
    /**
     * 变更数量
     */
    private BigDecimal changeQuantity;
    /**
     * 变更类型
     */
    private Integer changeType;
    /**
     * 规格要求
     */
    private String specificationLabel;
    /**
     * 包装要求
     */
    private String packageLabel;
    /**
     * 品质要求
     */
    private String quantityLabel;
    /**
     * 
     */
    private Long outOrderItemId;
    /**
     * 
     */
    private CommodityStatus commodityStatus;
}