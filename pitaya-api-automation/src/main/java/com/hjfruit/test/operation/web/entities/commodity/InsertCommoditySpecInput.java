package com.hjfruit.test.operation.web.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class InsertCommoditySpecInput {
    /**
     * 商品规格id
     */
    private Integer commoditySpecId;
    /**
     * 商品规格名称
     */
    @Needed
    private String commoditySpecName;
    /**
     * 商品规格排序
     */
    @Needed
    private Integer commoditySpecSort;
    /**
     * 多语言
     */
    private NameLocale nameLocale;
    /**
     * 名称排序
     */
    @Needed
    private Integer nameSort;
    /**
     * 商品规格选项列表信息
     */
    @Needed
    private List<InsertCommoditySpecOptionInput> commoditySpecOptions;
}