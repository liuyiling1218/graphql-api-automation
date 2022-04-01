package com.hjfruit.test.operation.web.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class InsertCommodityInput {
    /**
     *
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    @Needed
    private String commodityName;
    /**
     * 商品类型id
     */
    @Needed
    private Integer commodityTypeId;
    /**
     * 商品品类id
     */
    @Needed
    private Integer commodityCategoryId;
    /**
     * 商品品种id
     */
    private Integer commodityVarietyId;
    /**
     * 商品产地id
     */
    private Integer commodityPlaceOriginId;
    /**
     * 多语言c
     */
    private NameLocale nameLocale;
    /**
     * 规格信息
     */
    @Needed
    private List<InsertCommoditySpecInput> commoditySpecs;
}