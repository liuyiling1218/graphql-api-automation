package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CommoditySpecInput {
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
    private List<CommoditySpecOptionInput> commoditySpecOptionList;
    /**
     *
     */
    private Integer commoditySpecSort;
}