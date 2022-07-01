package com.hjfruit.test.pitaya.app.entities.stock;
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
public class StockBatchPayloadV2{
    /**
     * 
     */
    private String batchId;
    /**
     * skuId
     */
    private String commoditySkuId;
    /**
     * basisId
     */
    private String basisId;
    /**
     * 商品分类
     */
    private String commodityTypeId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 批次号
     */
    private String batchCode;
    /**
     * 单价类型
     */
    private String priceType;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 规格id
     */
    private List<String> commoditySpecOptionIdList;
    /**
     * 规格名称
     */
    private List<String> specOptionList;
    /**
     * 库存数量
     */
    private Float unitQuantity;
    /**
     * 库存单位
     */
    private String unitType;
    /**
     * 
     */
    private String unitTypeName;
    /**
     * 库存总计数量
     */
    private Float totalQuantity;
    /**
     * 总计数量单位
     */
    private String totalType;
    /**
     * 
     */
    private String totalTypeName;
    /**
     * 归属类型
     */
    private Integer belongType;
    /**
     * 归属id
     */
    private String belongId;
    /**
     * 归属name
     */
    private String belongName;
    /**
     * 仓库名称
     */
    private String warehouseId;
    /**
     * 
     */
    private String warehouseName;
    /**
     * 
     */
    private Long createTime;
    /**
     * 分类id
     */
    private String categoryId;
    /**
     * # 在库时间inTime:Long# 商品状态（10：正常 20：预警 30：呆滞品）commodityStatus:Intsku 信息
     */
    private CommoditySkuPayload sku;
}