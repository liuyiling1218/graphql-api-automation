package com.hjfruit.test.pitaya.app.entities.production.order;

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
public class TransferCommodityItemBillPayload {
    /**
     * 订单明细id
     */
    private String itemId;
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
     * 单位类型数量（例：kg，个）
     */
    private BigDecimal unitQuantity;
    /**
     * 单位类型（例：kg，个）
     */
    private Integer unitType;
    /**
     * 单位类型名称
     */
    private String unitTypeName;
    /**
     * 总计类型数量（例：件）
     */
    private BigDecimal totalQuantity;
    /**
     * 总计类型（例：件）
     */
    private Integer totalType;
    /**
     * 总计类型名称
     */
    private String totalTypeName;
    /**
     * 销售单价
     */
    private BigDecimal unitPrice;
    /**
     * 计价单位
     */
    private Integer priceType;
    /**
     * 计价单位类型名称
     */
    private String priceTypeName;
    /**
     * 批次id
     */
    private String batchId;
    /**
     * 批次号
     */
    private String batchCode;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人id
     */
    private Integer createBy;
    /**
     * 更新时间
     */
    private Long updateTime;
    /**
     * 更新人id
     */
    private Integer updateBy;
    /**
     * 库存数量
     */
    private BigDecimal stockUnitQuantity;
    /**
     *
     */
    private BigDecimal stockTotalQuantity;
    /**
     * 所属客户id
     */
    private Integer customerId;
    /**
     * 所属客户名称
     */
    private String customerName;
    /**
     * 换算关系
     */
    private BigDecimal conversion;
    /**
     * 小计
     */
    private BigDecimal amount;
}