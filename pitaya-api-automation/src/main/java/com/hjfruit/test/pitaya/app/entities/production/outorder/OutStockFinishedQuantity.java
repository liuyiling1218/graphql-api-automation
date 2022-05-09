package com.hjfruit.test.pitaya.app.entities.production.outorder;

import com.hjfruit.test.pitaya.app.entities.production.common.QuantityInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutStockFinishedQuantity {
    /**
     *
     */
    QuantityInterface QuantityInterface;
    /**
     *
     */
    private BigDecimal unitQuantity;
    /**
     *
     */
    private BigDecimal totalQuantity;
}