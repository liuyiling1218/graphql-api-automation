package com.hjfruit.test.pitaya.app.entities.plan;

import com.hjfruit.test.pitaya.app.entities.commodity.CommoditySpecOptionPayload;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 商品详情实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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