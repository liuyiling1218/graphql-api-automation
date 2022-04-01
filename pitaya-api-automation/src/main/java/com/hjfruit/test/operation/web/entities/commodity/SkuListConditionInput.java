package com.hjfruit.test.operation.web.entities.commodity;

import com.hjfruit.test.operation.web.entities.Page;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class SkuListConditionInput {
    /**
     *
     */
    private Page page;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 规格选项
     */
    private List<CommoditySpecOptionConditionInput> commoditySpecOptionConditionInput;
}