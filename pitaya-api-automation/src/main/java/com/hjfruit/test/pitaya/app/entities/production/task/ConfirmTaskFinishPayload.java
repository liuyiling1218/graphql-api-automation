package com.hjfruit.test.pitaya.app.entities.production.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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