package com.hjfruit.test.operation.web.entities.commodity;

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
    private Integer commoditySpecId;
    /**
     *
     */
    private String commoditySpecName;
    /**
     *
     */
    private List<CommoditySpecOptionPayload> commoditySpecOptionList;
    /**
     *
     */
    private Integer commoditySpecSort;
    /**
     *
     */
    private Integer nameSort;
    /**
     *
     */
    private NameLocalePayload nameLocale;
}