package com.hjfruit.test.pitaya.entities.production.purchasereturn.interfaces;

import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.purchasereturn.common.PurchaseReturnQueryStatus;
import lombok.Data;

/**
 *
 */
@Data
public class PagePurchaseReturnInput {
    /**
     * 传当天的时间段
     */
    private Long startTime;
    /**
     *
     */
    private Long endTime;
    /**
     * 查询状态
     */
    private PurchaseReturnQueryStatus status;
    /**
     *
     */
    private String keywords;
    /**
     *
     */
    private Page page;
}