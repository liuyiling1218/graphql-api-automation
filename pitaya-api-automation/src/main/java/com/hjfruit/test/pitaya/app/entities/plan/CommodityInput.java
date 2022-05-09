package com.hjfruit.test.pitaya.app.entities.plan;

import com.hjfruit.test.pitaya.app.entities.production.outorder.OutOrderItemRequestInput;
import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 商品入参
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommodityInput {
    /**
     * 任务明细id
     */
    private String taskItemId;
    /**
     * 商品sku id
     */
    @Needed
    private Integer commoditySkuId;
    /**
     * 期望数量
     */
    @Needed
    private BigDecimal expectNum;
    /**
     *
     */
    private String specificationLabel;
    /**
     *
     */
    private String packageLabel;
    /**
     *
     */
    private List<String> packageIds;
    /**
     *
     */
    private List<OutOrderItemRequestInput> packageRequireInfos;
    /**
     *
     */
    private String quantityLabel;
}