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