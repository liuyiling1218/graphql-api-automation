package com.hjfruit.test.pitaya.app.entities.v2.types.transfer;

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
public class OutStockRecordListPayload {
    /**
     *
     */
    private List<OutStockRecordsPayload> outStockRecords;
    /**
     *
     */
    private List<OutStockOrderWaitCommodityPayload> outStockOrderWaitCommodities;
}