package com.hjfruit.test.operation.web.entities.commodity;

import com.hjfruit.test.operation.web.entities.NameInput;
import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CategoryInput {
    /**
     * 商品分类id
     */
    private Integer categoryId;
    /**
     * 商品分类名称
     */
    private List<NameInput> nameLocale;
    /**
     * 商品类型id
     */
    @Needed
    private Integer commodityTypeId;
    /**
     * 排序
     */
    @Needed
    private Integer categorySort;
}