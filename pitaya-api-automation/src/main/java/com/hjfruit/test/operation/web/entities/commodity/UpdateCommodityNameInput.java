package com.hjfruit.test.operation.web.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class UpdateCommodityNameInput {
    /**
     * 商品id
     */
    @Needed
    private Integer commodityId;
    /**
     * 商品名称
     */
    @Needed
    private String commodityName;
    /**
     * 多语言
     */
    private NameLocale nameLocale;
}