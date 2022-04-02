package com.hjfruit.test.pitaya.app.entities.cost;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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