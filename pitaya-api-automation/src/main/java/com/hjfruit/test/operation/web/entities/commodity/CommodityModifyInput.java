package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CommodityModifyInput {
    /**
     *
     */
    private Integer commodityId;
    /**
     *
     */
    private List<CommoditySpecInput> commoditySpecs;
}