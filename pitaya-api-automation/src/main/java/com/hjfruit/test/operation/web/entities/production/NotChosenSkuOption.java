package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 * sku列表可选sku
 */
@Data
public class NotChosenSkuOption {
    /**
     * sku id
     */
    private Integer commoditySkuId;
    /**
     * 规格选项
     */
    private List<Integer> optionId;
}