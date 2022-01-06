package com.hjfruit.test.pitaya.app.entities.secondment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondmentStatusInput {
    /**
     * 借调id
     */
    private String secondmentId;
    /**
     * 驳回原因
     */
    private String description;
    /**
     * 借调状态
     */
    private Integer secondmentStatus;
}