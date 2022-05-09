package com.hjfruit.test.pitaya.app.entities.plan;

import com.hjfruit.test.pitaya.app.entities.production.outorder.CommodityStatus;
import com.hjfruit.test.pitaya.app.entities.production.outorder.OutOrderItemRequestPayload;
import com.hjfruit.test.pitaya.app.entities.production.outorder.SaleChangePayload;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskItemPayload {
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