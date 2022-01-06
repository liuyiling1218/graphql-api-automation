package com.hjfruit.test.pitaya.app.entities.cost;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCostStatusInput {
    /**
     * id
     */
    @Needed
    private String billId;
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