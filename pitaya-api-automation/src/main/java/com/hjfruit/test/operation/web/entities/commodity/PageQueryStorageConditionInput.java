package com.hjfruit.test.operation.web.entities.commodity;

import com.hjfruit.test.operation.web.entities.Page;
import lombok.Data;

/**
 * 查询商品存储管理条件【分页】请求参数
 */
@Data
public class PageQueryStorageConditionInput {
    /**
     * 商品名称
     */
    private String categoryName;
    /**
     * 分页参数
     */
    private Page page;
}