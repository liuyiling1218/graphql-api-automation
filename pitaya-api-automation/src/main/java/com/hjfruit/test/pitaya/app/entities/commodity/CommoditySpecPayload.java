package com.hjfruit.test.pitaya.app.entities.commodity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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