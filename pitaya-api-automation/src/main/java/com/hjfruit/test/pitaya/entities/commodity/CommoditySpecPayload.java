package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CommoditySpecPayload {
    /**
     *
     */
    private Integer commodityId;
    /**
     *
     */
    private Integer commoditySpecId;
    /**
     *
     */
    private String commoditySpecName;
    /**
     *
     */
    private Integer commoditySpecSort;
    /**
     *
     */
    private List<CommoditySpecOptionPayload> commoditySpecOption;
}