package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class ListSku {
    /**
     * sku Id
     */
    private Integer commoditySkuId;
    /**
     * 规格选项
     */
    private List<SkuOption> skuOption;
    /**
     * 总计类型
     */
    private String total;
    /**
     * 单位数量
     */
    private String unit;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 变更状态
     */
    private Integer change;
    /**
     * 属性
     */
    private List<String> property;
}