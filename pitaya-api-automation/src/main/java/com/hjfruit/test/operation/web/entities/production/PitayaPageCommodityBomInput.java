package com.hjfruit.test.operation.web.entities.production;

import com.hjfruit.test.operation.web.entities.Page;
import lombok.Data;

/**
 * bom列表请求参数
 */
@Data
public class PitayaPageCommodityBomInput {
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 分页参数
     */
    private Page page;
}