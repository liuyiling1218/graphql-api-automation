package com.hjfruit.test.pitaya.app.entities.v2.types.transfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 列表获取审核单入库记录
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InStockRecordListPayload {
    /**
     *
     */
    private List<InStockRecordPayload> inStockRecordRespList;
    /**
     * 待入库商品信息
     */
    private List<StockOrderWaitCommodityPayload> waitCommoditiesList;
}