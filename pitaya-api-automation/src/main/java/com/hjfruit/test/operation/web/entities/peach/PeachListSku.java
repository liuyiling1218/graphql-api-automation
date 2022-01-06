package com.hjfruit.test.operation.web.entities.peach;

import com.hjfruit.test.operation.web.entities.production.SkuOption;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PeachListSku {
    /**
     * sku Id
     */
    private Integer commoditySkuId;
    /**
     * 规格选项
     */
    private List<SkuOption> skuOption;
    /**
     * 状态
     */
    private Integer status;
}