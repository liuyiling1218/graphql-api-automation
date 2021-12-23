package com.hjfruit.test.pitaya.entities.secondment;

import lombok.Data;

/**
 *
 */
@Data
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