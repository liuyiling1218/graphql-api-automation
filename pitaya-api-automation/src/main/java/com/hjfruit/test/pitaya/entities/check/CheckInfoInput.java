package com.hjfruit.test.pitaya.entities.check;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CheckInfoInput {
    /**
     * 仓库id
     */
    private Integer warehouseId;
    /**
     *
     */
    private String warehouseName;
    /**
     * 盘点日期
     */
    private Long checkDate;
    /**
     *
     */
    private String remark;
    /**
     * 具体库存盘点详情
     */
    private List<CheckDetailInput> checkDetailList;
}