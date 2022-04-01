package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

/**
 *
 */
@Data
public class CommoditySpecOptionPayload {
    /**
     *
     */
    private Integer commoditySpecOptionId;
    /**
     *
     */
    private String commoditySpecOptionName;
    /**
     *
     */
    private NameLocalePayload nameLocale;
    /**
     *
     */
    private Integer commoditySpecOptionSort;
}