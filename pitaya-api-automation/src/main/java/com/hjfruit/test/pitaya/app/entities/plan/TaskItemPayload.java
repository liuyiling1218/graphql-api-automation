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
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskItemPayload{
    /**
     * 
     */
    private String taskItemId;
    /**
     * 
     */
    private Integer commodityId;
    /**
     * 
     */
    private String commodityName;
    /**
     * 
     */
    private Integer commodityBomId;
    /**
     * 
     */
    private Integer commoditySkuId;
    /**
     * 
     */
    private List<Integer> commoditySpecOptionId;
    /**
     * 
     */
    private List<String> skuTextDescription;
    /**
     * 
     */
    private BigDecimal expectNum;
    /**
     * 
     */
    private BigDecimal completedNum;
    /**
     * 
     */
    private BigDecimal unitQuantity;
    /**
     * 
     */
    private Integer unitType;
    /**
     * 
     */
    private String unitTypeName;
    /**
     * 
     */
    private Integer totalType;
    /**
     * 
     */
    private String totalTypeName;
    /**
     * 0 没有通知  10 通知未读  20 通知已处理  30 通知已忽略
     */
    private Integer planChangeNotice;
    /**
     * 
     */
    private List<SaleChangePayload> saleChangePayload;
    /**
     * 规格要求
     */
    private String specificationLabel;
    /**
     * 包装要求
     */
    private List<OutOrderItemRequestPayload> packageRequireInfos;
    /**
     * 包装要求
     */
    private String packageLabel;
    /**
     * 品质要求
     */
    private String quantityLabel;
    /**
     * 预估销量
     */
    private BigDecimal planQuantity;
    /**
     * 库存成品数量
     */
    private BigDecimal stockQuantity;
    /**
     * 
     */
    private String outOrderItemId;
    /**
     * 
     */
    private CommodityStatus commodityStatus;
}