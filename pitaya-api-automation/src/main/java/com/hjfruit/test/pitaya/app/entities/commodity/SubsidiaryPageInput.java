package com.hjfruit.test.pitaya.app.entities.commodity;

import com.hjfruit.test.pitaya.app.entities.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubsidiaryPageInput {
    /**
     *
     */
    private Page page;
    /**
     *
     */
    private String commodityName;
}