package com.hjfruit.test.pitaya.app.entities.stock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockPayload {
    /**
     *
     */
    private Integer commoditySkuId;
    /**
     * 商品分类
     */
    private Integer commodityTypeId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 批次号
     */
    private String batchCode;
    /**
     * 规格id
     */
    private List<Integer> commoditySpecOptionIdList;
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
     * 归属类型
     */
    private Integer belongType;
    /**
     * 归属id
     */
    private Integer belongId;
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
    private Integer categoryId;
    /**
     * 在库时间
     */
    private Long inTime;
    /**
     * 商品状态（10：正常 20：预警 30：呆滞品）
     */
    private Integer commodityStatus;
}