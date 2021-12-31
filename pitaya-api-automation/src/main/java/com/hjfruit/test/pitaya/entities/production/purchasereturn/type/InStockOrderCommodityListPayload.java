package com.hjfruit.test.pitaya.entities.production.purchasereturn.type;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class InStockOrderCommodityListPayload {
    /**
     *
     */
    private List<InStockOrderCommodityPayload> inStockOrderCommodity;
}