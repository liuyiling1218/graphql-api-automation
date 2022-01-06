package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class SkuOptionsPayLoad {
    /**
     * 规格id
     */
    private Integer commoditySpecId;
    /**
     * 规格名称
     */
    private String commoditySpecName;
    /**
     * 名称排序
     */
    private Integer nameSort;
    /**
     * 规格选项
     */
    private List<SkuCommoditySpecOptionPayLoad> commoditySpecOptionVOList;
}