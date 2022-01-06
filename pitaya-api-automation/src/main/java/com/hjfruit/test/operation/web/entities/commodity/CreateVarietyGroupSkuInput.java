package com.hjfruit.test.operation.web.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 * 添加sku
 */
@Data
public class CreateVarietyGroupSkuInput {
    /**
     *
     */
    @Needed
    private Integer group;
    /**
     *
     */
    @Needed
    private List<Integer> skuId;
}