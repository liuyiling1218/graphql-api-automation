package com.hjfruit.test.operation.web.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 * 批量删除
 */
@Data
public class DelVarietyGroupSkuInput {
    /**
     *
     */
    @Needed
    private List<Integer> varietyGroupSkuId;
}