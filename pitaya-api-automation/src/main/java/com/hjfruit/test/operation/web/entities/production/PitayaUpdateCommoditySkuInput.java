package com.hjfruit.test.operation.web.entities.production;

import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.annotation.NotEmpty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 编辑sku
 */
@Data
public class PitayaUpdateCommoditySkuInput {
    /**
     * 单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 单位数量单位
     */
    @Needed
    private Integer unitType;
    /**
     * 总计类型
     */
    private Integer totalType;
    /**
     * sku属性
     */
    private List<Integer> property;
    /**
     * 状态
     */
    @Needed
    private Integer status;
    /**
     * sku id
     */
    @Needed
    @NotEmpty
    private List<Integer> skuId;
}