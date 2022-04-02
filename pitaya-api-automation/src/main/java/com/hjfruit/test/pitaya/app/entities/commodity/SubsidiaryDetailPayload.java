package com.hjfruit.test.pitaya.app.entities.commodity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubsidiaryDetailPayload {
    /**
     *
     */
    private Integer commodityId;
    /**
     *
     */
    private String commodityName;
    /**
     *
     */
    private String commodityCategoryName;
    /**
     *
     */
    private Integer status;
    /**
     *
     */
    private Integer skuSum;
    /**
     *
     */
    private CommoditySpecPayload commoditySpec;
}