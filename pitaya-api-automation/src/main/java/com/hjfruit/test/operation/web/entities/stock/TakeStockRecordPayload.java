package com.hjfruit.test.operation.web.entities.stock;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 盘点记录信息
 */
@Data
public class TakeStockRecordPayload {
    /**
     * 盘点记录Id
     */
    private Integer checkId;
    /**
     * 盘点商户
     */
    private String orgName;
    /**
     * 盘点日期
     */
    private Long checkDate;
    /**
     * 库存状态
     */
    private Integer totalStatus;
    /**
     * 盘点仓库
     */
    private String warehouseName;
    /**
     * 盘点数量
     */
    private BigDecimal checkNum;
    /**
     * 操作人
     */
    private String username;
    /**
     * 提交时间
     */
    private Long createTime;
    /**
     * 备注
     */
    private String remark;
}