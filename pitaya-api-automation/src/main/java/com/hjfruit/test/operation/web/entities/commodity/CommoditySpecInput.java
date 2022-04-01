package com.hjfruit.test.operation.web.entities.commodity;

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
    /**
     *
     */
    private NameLocale nameLocale;
    /**
     *
     */
    private Integer nameSort;
}