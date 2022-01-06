package com.hjfruit.test.pitaya.entities.cost;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class UpdateCostStatusInput {
    /**
     * id
     */
    @Needed
    private String applyId;
    /**
     * 更改后状态
     */
    @Needed
    private Integer status;
    /**
     *
     */
    private String remark;
}