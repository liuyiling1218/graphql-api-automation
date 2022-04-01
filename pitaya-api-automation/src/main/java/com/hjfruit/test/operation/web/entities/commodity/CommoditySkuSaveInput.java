package com.hjfruit.test.operation.web.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.annotation.NotEmpty;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CommoditySkuSaveInput {
    /**
     * 商品id
     */
    @Needed
    private Integer commodityId;
    /**
     * 规格类型不可为空
     */
    @Needed
    @NotEmpty
    private List<Integer> commoditySpecIdList;
    /**
     * 规格选项不可为空
     */
    @Needed
    @NotEmpty
    private List<Integer> commoditySpecOptionIdsList;
}