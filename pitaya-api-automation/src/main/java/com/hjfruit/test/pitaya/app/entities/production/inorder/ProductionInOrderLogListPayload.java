package com.hjfruit.test.pitaya.app.entities.production.inorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionInOrderLogListPayload {
    /**
     *
     */
    private List<ProductionInOrderLogPayload> inOrderLogList;
}