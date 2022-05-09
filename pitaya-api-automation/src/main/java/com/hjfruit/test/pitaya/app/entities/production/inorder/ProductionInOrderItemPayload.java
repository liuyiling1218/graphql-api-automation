package com.hjfruit.test.pitaya.app.entities.production.inorder;

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
public class ProductionInOrderItemPayload {
    /**
     * 生产入库订单明细id
     */
    private String inOrderItemId;
    /**
     * 生库订单id
     */
    private String inOrderId;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 商品sku id
     */
    private Integer commoditySkuId;
    /**
     * 商品规格选项id
     */
    private List<Integer> commoditySpecOptionId;
    /**
     * sku文字描述，规格选项文字数组
     */
    private List<String> skuTextDescription;
    /**
     * 单位类型数量(x个)
     */
    private BigDecimal unitQuantity;
    /**
     * 单位类型（例：kg，个）
     */
    private Integer unitType;
    /**
     * 单位类型数量（例：kg，个）
     */
    private String unitTypeName;
    /**
     * 总计类型数量(x箱)
     */
    private BigDecimal totalQuantity;
    /**
     * 总计类型（例：件）
     */
    private Integer totalType;
    /**
     * 总计类型数量（例：件）
     */
    private String totalTypeName;
    /**
     *
     */
    private Long createTime;
    /**
     *
     */
    private Integer createBy;
    /**
     *
     */
    private Long updateTime;
    /**
     *
     */
    private String batchId;
    /**
     *
     */
    private String batchCode;
    /**
     *
     */
    private BigDecimal conversion;
    /**
     *
     */
    private BigDecimal unitQuantityPicking;
    /**
     *
     */
    private BigDecimal totalQuantityPicking;
    /**
     *
     */
    private InStockFinishedQuantity inStockFinishedQuantity;
}