package com.hjfruit.test.pitaya.app.entities.secondment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondmentStockPayload {
    /**
     *
     */
    private Integer skuId;
    /**
     *
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 批次号
     */
    private String batchId;
    /**
     *
     */
    private String batchCode;
    /**
     * 规格字符串，由后端组装
     */
    private List<String> skuTextDescriptionList;
    /**
     * 库存数量
     */
    private Float unitQuantity;
    /**
     * 库存单位
     */
    private Integer unitType;
    /**
     *
     */
    private String unitTypeName;
    /**
     * 库存总计数量
     */
    private Float totalQuantity;
    /**
     * 总计数量单位
     */
    private Integer totalType;
    /**
     *
     */
    private String totalTypeName;
    /**
     * 归属名称
     */
    private Integer belongId;
    /**
     * 归属类型
     */
    private Integer belongType;
    /**
     *
     */
    private Float unitPrice;
    /**
     *
     */
    private Integer priceType;
    /**
     *
     */
    private String priceTypeName;
    /**
     *
     */
    private BigDecimal conversion;
}