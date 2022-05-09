package com.hjfruit.test.pitaya.app.entities.production.purchasereturn.interfaces;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.purchasereturn.common.PurchaseReturnQueryStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagePurchaseReturnInput {
    /**
     * 采购退货时间
     */
    private Long purchaseReturnTime;
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