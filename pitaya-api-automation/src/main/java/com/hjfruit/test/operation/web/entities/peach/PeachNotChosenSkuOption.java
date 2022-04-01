package com.hjfruit.test.operation.web.entities.peach;

import lombok.Data;

import java.util.List;

/**
 * 可选sku
 */
@Data
public class PeachNotChosenSkuOption {
    /**
     * sku id
     */
    private Integer commoditySkuId;
    /**
     * 规格选项
     */
    private List<Integer> optionId;
}