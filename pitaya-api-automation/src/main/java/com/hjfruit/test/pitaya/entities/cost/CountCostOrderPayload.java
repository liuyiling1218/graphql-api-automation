package com.hjfruit.test.pitaya.entities.cost;

import lombok.Data;

/**
 *
 */
@Data
public class CountCostOrderPayload {
    /**
     * 待提交条数
     */
    private Integer countNotSubmit;
    /**
     * 待审核条数
     */
    private Integer countNotAudit;
}