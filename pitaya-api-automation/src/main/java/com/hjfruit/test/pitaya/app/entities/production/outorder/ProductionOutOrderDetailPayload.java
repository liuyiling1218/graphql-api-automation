package com.hjfruit.test.pitaya.app.entities.production.outorder;

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
public class ProductionOutOrderDetailPayload {
    /**
     * 生产出库订单明细id
     */
    private String outOrderItemId;
    /**
     * 生库订单id
     */
    private String outOrderId;
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
     * 单位类型数量
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
     * 总计类型数量
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
    private BigDecimal stockTotalQuantity;
    /**
     *
     */
    private Integer stockTotalType;
    /**
     *
     */
    private BigDecimal stockUnitQuantity;
    /**
     *
     */
    private Integer stockUnitType;
    /**
     *
     */
    private BigDecimal conversion;
    /**
     * 批次id
     */
    private String batchId;
    /**
     *
     */
    private String batchCode;
    /**
     * 实际领用量
     */
    private BigDecimal pickingUnitQuantity;
    /**
     *
     */
    private BigDecimal pickingTotalQuantity;
    /**
     * 所属客户
     */
    private String belongCustomerName;
    /**
     * 报损原因
     */
    private String damageReason;
    /**
     * 报损照片
     */
    private List<String> photos;
    /**
     *
     */
    private OutStockFinishedQuantity outStockFinishedQuantity;
}