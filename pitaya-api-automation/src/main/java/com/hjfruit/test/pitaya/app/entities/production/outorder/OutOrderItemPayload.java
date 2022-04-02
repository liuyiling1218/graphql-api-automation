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
public class OutOrderItemPayload {
    /**
     * 生产出库订单明细id
     */
    private String outOrderItemId;
    /**
     * 出库订单id
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
    private BigDecimal salePrice;
    /**
     * 计价单位
     */
    private Integer salePriceType;
    /**
     * 计价单位类型名称
     */
    private String salePriceTypeName;
    /**
     * 最大销量
     */
    private Integer maxQuantity;
    /**
     * 计划生产
     */
    private Integer planQuantity;
    /**
     * 周转筐数量
     */
    private Integer basketQuantity;
    /**
     * 周转筐归属客户id
     */
    private Integer basketCustomerId;
    /**
     * 周转筐归属客户名称
     */
    private String basketCustomerName;
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
     * 删除标识：1删除、99未删除，默认99
     */
    private Integer deleted;
    /**
     * 更新人id
     */
    private Integer updateBy;
    /**
     * 待出库库小单位的数量 如：10
     */
    private BigDecimal waitUnitQuantity;
    /**
     * 待出库库副单位数量 如 10
     */
    private BigDecimal waitTotalQuantity;
    /**
     * 是否完成出库：1 是 99 否
     */
    private Integer completeOutStock;
    /**
     * bomid
     */
    private Integer commodityBomId;
    /**
     * 总价
     */
    private BigDecimal unitTotalPrice;
    /**
     * 报损原因
     */
    private String damageReason;
    /**
     * 1.5新增
     */
    private String batchId;
    /**
     *
     */
    private String batchCode;
    /**
     * 库存单价
     */
    private BigDecimal stockUnitPrice;
    /**
     * 库存单价的单位
     */
    private Integer stockUnitPriceType;
    /**
     * 库存单价名称
     */
    private String stockUnitPriceTypeName;
    /**
     * 单价小计
     */
    private BigDecimal stockTotalPrice;
    /**
     * 所属客户
     */
    private String belongCustomerName;
    /**
     * 次品销售照片
     */
    private List<String> photos;
    /**
     * 实际销量
     */
    private BigDecimal realQuantity;
    /**
     *
     */
    private BigDecimal saleTotalPrice;
    /**
     * v1.7 已入库量副单位
     */
    private BigDecimal inBoundTotalQuantity;
    /**
     * v1.7 已入库量基本单位
     */
    private BigDecimal inBoundUnitQuantity;
    /**
     * 转换关系
     */
    private BigDecimal conversion;
    /**
     *
     */
    private BigDecimal outStockFinishUnitQuantity;
    /**
     *
     */
    private BigDecimal outStockFinishTotalQuantity;
    /**
     *
     */
    private Integer belongCustomerId;
    /**
     *
     */
    private BigDecimal pickingUnitQuantity;
    /**
     *
     */
    private BigDecimal pickingTotalQuantity;
}