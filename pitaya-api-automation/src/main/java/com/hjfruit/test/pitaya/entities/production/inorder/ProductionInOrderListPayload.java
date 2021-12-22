package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class ProductionInOrderListPayload {
    /**
     *
     */
    private List<ProductionInOrderPayload> ProductionInOrdersList;
}