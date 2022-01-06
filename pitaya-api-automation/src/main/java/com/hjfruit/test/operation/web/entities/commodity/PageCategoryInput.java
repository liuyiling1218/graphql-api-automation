package com.hjfruit.test.operation.web.entities.commodity;

import com.hjfruit.test.operation.web.entities.Page;
import lombok.Data;

/**
 *
 */
@Data
public class PageCategoryInput {
    /**
     * 分页参数
     */
    private Page page;
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
    /**
     * 商品分类名称（模糊查询）
     */
    private String categoryName;
}