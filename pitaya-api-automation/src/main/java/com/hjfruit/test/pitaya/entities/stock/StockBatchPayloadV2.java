package com.hjfruit.test.pitaya.entities.stock;

import com.hjfruit.test.pitaya.entities.commodity.CommoditySkuPayload;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class StockBatchPayloadV2 {
    /**
     *
     */
    private String batchId;
    /**
     * skuId
     */
    private String commoditySkuId;
    /**
     * basisId
     */
    private String basisId;
    /**
     * 商品分类
     */
    private String commodityTypeId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 批次号
     */
    private String batchCode;
    /**
     * 单价类型
     */
    private String priceType;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 规格id
     */
    private List<String> commoditySpecOptionIdList;
    /**
     * 规格名称
     */
    private List<String> specOptionList;
    /**
     * 库存数量
     */
    private Float unitQuantity;
    /**
     * 库存单位
     */
    private String unitType;
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
    private String totalType;
    /**
     *
     */
    private String totalTypeName;
    /**
     * 归属类型
     */
    private Integer belongType;
    /**
     * 归属id
     */
    private String belongId;
    /**
     * 归属name
     */
    private String belongName;
    /**
     * 仓库名称
     */
    private String warehouseId;
    /**
     *
     */
    private String warehouseName;
    /**
     *
     */
    private Long createTime;
    /**
     * 分类id
     */
    private String categoryId;
    /**
     * # 在库时间inTime:Long# 商品状态（10：正常 20：预警 30：呆滞品）commodityStatus:Intsku 信息
     */
    private CommoditySkuPayload sku;
}