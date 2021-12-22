package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

/**
 *
 */
@Data
public class ConfirmTaskFinishPayload {
    /**
     *
     */
    private Picking picking;
    /**
     *
     */
    private Warehousing warehousing;
    /**
     *
     */
    private ReturnMaterial returnMaterial;
    /**
     *
     */
    private DamagedOrder damagedOrder;
}