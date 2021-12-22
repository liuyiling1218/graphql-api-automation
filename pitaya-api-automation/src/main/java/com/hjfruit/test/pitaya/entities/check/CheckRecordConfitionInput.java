package com.hjfruit.test.pitaya.entities.check;

import lombok.Data;

/**
 *
 */
@Data
public class CheckRecordConfitionInput {
    /**
     * 仓库id
     */
    private Integer warehouseId;
    /**
     * 盘点开始日期
     */
    private Long startDate;
    /**
     * 盘点结束日期
     */
    private Long expireDate;
    /**
     * 商品分类
     */
    private Integer commodityTypeId;
}