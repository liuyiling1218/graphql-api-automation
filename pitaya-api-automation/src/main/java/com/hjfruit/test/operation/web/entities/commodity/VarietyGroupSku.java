package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

/**
 *
 */
@Data
public class VarietyGroupSku {
    /**
     * 主键id
     */
    private Integer varietySkuId;
    /**
     * 品种组id
     */
    private Integer groupId;
    /**
     * sku id
     */
    private Integer skuId;
    /**
     * 品类名称
     */
    private String categoryName;
    /**
     * spu名称
     */
    private String spuName;
    /**
     * sku名称
     */
    private String skuName;
}