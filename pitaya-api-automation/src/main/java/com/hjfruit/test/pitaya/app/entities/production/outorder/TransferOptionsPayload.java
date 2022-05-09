package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferOptionsPayload {
    /**
     *
     */
    private String label;
    /**
     *
     */
    private Integer value;
}