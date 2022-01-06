package com.hjfruit.test.pitaya.app.entities.production.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTransferOrderFeeStatusPayload {
    /**
     *
     */
    private Integer toSubmit;
    /**
     *
     */
    private Integer submit;
}