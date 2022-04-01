package com.hjfruit.test.pitaya.app.entities.check;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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