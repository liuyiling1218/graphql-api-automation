package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class SkuDetailVOResponse {
    /**
     *
     */
    private String skuName;
    /**
     *
     */
    private Integer commoditySkuId;
    /**
     *
     */
    private Integer commodityId;
    /**
     *
     */
    private List<SpecPayload> commoditySpecs;
    /**
     *
     */
    private List<SpecOptionPayload> commoditySpecOption;
}