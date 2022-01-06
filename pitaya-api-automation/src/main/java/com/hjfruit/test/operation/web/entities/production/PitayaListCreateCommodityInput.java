package com.hjfruit.test.operation.web.entities.production;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 * 未添加商品列表添加商品
 */
@Data
public class PitayaListCreateCommodityInput {
    /**
     *
     */
    @Needed
    private List<PitayaCreateCommodityInput> createCommodityInput;
}