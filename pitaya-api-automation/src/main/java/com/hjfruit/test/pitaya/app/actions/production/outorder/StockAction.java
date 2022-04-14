package com.hjfruit.test.pitaya.app.actions.production.outorder;

import com.hjfruit.test.pitaya.app.apis.production.outorder.StockApi;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockAction {
    @Autowired
    StockApi stockApi;

    /**
     * @param stockBatchQueryInput
     * @return
     */
    public List<StockBatchPayload> stockBatches(StockBatchQueryInput stockBatchQueryInput) {
        return stockApi.stockBatches(stockBatchQueryInput);
    }

    /**
     * 获取商品库存批次
     *
     * @param listCommodityStockBatchInput
     * @return
     */
    public List<CommodityStockBatchPayload> commodityStockBatches(ListCommodityStockBatchInput listCommodityStockBatchInput) {
        return stockApi.commodityStockBatches(listCommodityStockBatchInput);
    }

    /**
     * @param stockSkuInput
     * @return
     */
    public List<SkuStockPayload> skuStocks(ListSkuStockInput stockSkuInput) {
        return stockApi.skuStocks(stockSkuInput);
    }

}