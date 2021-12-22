package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

/**
 *
 */
@Data
public class OutOrderItemRequestPayload {
    /**
     *
     */
    private Long commodityId;
    /**
     *
     */
    private String requestText;
}