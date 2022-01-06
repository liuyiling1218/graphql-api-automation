package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 编辑sku状态sku详情
 */
@Data
public class PitayaCommoditySkuDetailPayload {
    /**
     * sku id
     */
    private Integer commoditySkuId;
    /**
     * 商品类型
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名
     */
    private String commodityTypeName;
    /**
     * 单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 单位数量单位
     */
    private Integer unitType;
    /**
     * 总计类型
     */
    private Integer totalType;
    /**
     * sku属性
     */
    private List<Integer> property;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 变更标识
     */
    private Integer change;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 品类id
     */
    private Integer categoryId;
    /**
     * 品类名称
     */
    private String categoryName;
    /**
     * 品种id
     */
    private Integer varietyId;
    /**
     * 品种名称
     */
    private String varietyName;
    /**
     * 产地id
     */
    private Integer placeOriginId;
    /**
     * 产地名称
     */
    private String placeOriginName;
    /**
     * 商品规格id
     */
    private List<Integer> commoditySpecId;
    /**
     * 商品规格选项id
     */
    private List<Integer> commoditySpecOptionId;
    /**
     * 规格名称集合
     */
    private List<String> commoditySpecName;
    /**
     * 规格选项名称集合
     */
    private List<String> commoditySpecOptionName;
}