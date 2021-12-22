package com.hjfruit.test.pitaya.entities.check;

import lombok.Data;

/**
 *
 */
@Data
public class CheckDetailInput {
    /**
     *
     */
    private Integer skuId;
    /**
     *
     */
    private Integer batchId;
    /**
     *
     */
    private String batchCode;
    /**
     *
     */
    private Float unitQuantity;
    /**
     *
     */
    private Float totalQuantity;
    /**
     *
     */
    private Float checkUnitQuantity;
    /**
     *
     */
    private Float checkTotalQuantity;
    /**
     *
     */
    private String remark;
    /**
     * 商品分类
     */
    private Integer commodityTypeId;
    /**
     *
     */
    private String commodityTypeName;
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
    private String belongName;
}