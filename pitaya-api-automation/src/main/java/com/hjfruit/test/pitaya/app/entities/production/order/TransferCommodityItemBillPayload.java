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
public class TransferCommodityItemBillPayload{
    /**
     * 订单明细id
     */
    private String itemId;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
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
     * 单位类型数量（例：kg，个）
     */
    private BigDecimal unitQuantity;
    /**
     * 单位类型（例：kg，个）
     */
    private Integer unitType;
    /**
     * 单位类型名称
     */
    private String unitTypeName;
    /**
     * 总计类型数量（例：件）
     */
    private BigDecimal totalQuantity;
    /**
     * 总计类型（例：件）
     */
    private Integer totalType;
    /**
     * 总计类型名称
     */
    private String totalTypeName;
    /**
     * 销售单价
     */
    private BigDecimal unitPrice;
    /**
     * 计价单位
     */
    private Integer priceType;
    /**
     * 计价单位类型名称
     */
    private String priceTypeName;
    /**
     * 批次id
     */
    private String batchId;
    /**
     * 批次号
     */
    private String batchCode;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人id
     */
    private Integer createBy;
    /**
     * 更新时间
     */
    private Long updateTime;
    /**
     * 更新人id
     */
    private Integer updateBy;
    /**
     * 库存数量
     */
    private BigDecimal stockUnitQuantity;
    /**
     * 
     */
    private BigDecimal stockTotalQuantity;
    /**
     * 所属客户id
     */
    private Integer customerId;
    /**
     * 所属客户名称
     */
    private String customerName;
    /**
     * 换算关系
     */
    private BigDecimal conversion;
    /**
     * 小计
     */
    private BigDecimal amount;
    /**
     * 
     */
    private CommoditySku skuDetail;
}