package com.hjfruit.test.operation.web.entities.commodity;

import com.hjfruit.test.operation.web.entities.NamePayload;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class Category {
    /**
     * 品类id
     */
    private Integer categoryId;
    /**
     * 品类名称
     */
    private String categoryName;
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 品类排序
     */
    private Integer categorySort;
    /**
     * 语言
     */
    private List<NamePayload> nameLocale;
}