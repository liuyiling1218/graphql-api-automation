package com.hjfruit.test.pitaya.entities.plan;

import com.hjfruit.test.pitaya.entities.commodity.CommoditySpecOptionPayload;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 商品详情实体
 */
@Data
public class CommodityDetailPayload {
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品规格选项
     */
    private List<CommoditySpecOptionPayload> commoditySpecOption;
    /**
     * 期望数量
     */
    private BigDecimal expectNum;
}