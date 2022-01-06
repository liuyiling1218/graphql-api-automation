package com.hjfruit.test.operation.web.entities.peach;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 * 未添加商品列表添加商品
 */
@Data
public class PeachListCreateCommodityInput {
    /**
     *
     */
    @Needed
    private List<PeachCreateCommodityInput> createCommodityInput;
}