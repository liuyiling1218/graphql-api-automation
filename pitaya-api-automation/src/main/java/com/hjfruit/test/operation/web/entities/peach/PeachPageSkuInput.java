package com.hjfruit.test.operation.web.entities.peach;

import com.hjfruit.test.operation.web.entities.Page;
import com.hjfruit.test.operation.web.entities.production.SkuCondition;
import lombok.Data;

import java.util.List;

/**
 * sku列表
 */
@Data
public class PeachPageSkuInput {
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 规格筛选
     */
    private List<SkuCondition> skuCondition;
    /**
     * 分页对象
     */
    private Page page;
}