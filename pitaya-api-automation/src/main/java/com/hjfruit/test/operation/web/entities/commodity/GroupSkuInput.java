package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 * 品种组sku选择列表
 */
@Data
public class GroupSkuInput {
    /**
     *
     */
    private Integer typeId;
    /**
     *
     */
    private Integer categoryId;
    /**
     *
     */
    private Integer varietyId;
    /**
     *
     */
    private Integer origin;
    /**
     *
     */
    private Integer spuId;
    /**
     *
     */
    private List<Integer> specId;
    /**
     *
     */
    private List<Integer> optionId;
    /**
     *
     */
    private Integer varietyGroupId;
}