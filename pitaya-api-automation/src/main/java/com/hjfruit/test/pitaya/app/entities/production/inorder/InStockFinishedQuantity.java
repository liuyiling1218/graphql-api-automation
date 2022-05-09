package com.hjfruit.test.pitaya.app.entities.production.inorder;

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
public class InStockFinishedQuantity {
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