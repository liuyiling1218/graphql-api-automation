package com.hjfruit.test.pitaya.entities.commodity;

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
    private List<CommoditySpecInput> commoditySpecList;
}