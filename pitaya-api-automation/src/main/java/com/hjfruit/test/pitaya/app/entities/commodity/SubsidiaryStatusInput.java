package com.hjfruit.test.pitaya.app.entities.commodity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubsidiaryStatusInput {
    /**
     *
     */
    private Integer commodityId;
    /**
     *
     */
    private Integer status;
}