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