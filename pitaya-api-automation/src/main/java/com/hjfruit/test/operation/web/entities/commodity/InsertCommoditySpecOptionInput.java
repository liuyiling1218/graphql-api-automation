package com.hjfruit.test.operation.web.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class InsertCommoditySpecOptionInput {
    /**
     * 商品规格选项ID
     */
    private Integer commoditySpecOptionId;
    /**
     * 商品规格选项名称
     */
    @Needed
    private String commoditySpecOptionName;
    /**
     * 多语言
     */
    private NameLocale nameLocale;
    /**
     * 规则选项排序
     */
    @Needed
    private Integer commoditySpecOptionSort;
}