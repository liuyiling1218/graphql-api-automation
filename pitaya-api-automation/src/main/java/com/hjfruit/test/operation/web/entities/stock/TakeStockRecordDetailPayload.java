package com.hjfruit.test.operation.web.entities.stock;

import lombok.Data;

import java.util.List;

/**
 * 盘点详情
 */
@Data
public class TakeStockRecordDetailPayload {
    /**
     * 盘点仓库名称
     */
    private String warehouseName;
    /**
     * 盘点日期
     */
    private Long checkDate;
    /**
     * 盘点商品数量
     */
    private Integer checkCount;
    /**
     * 存在异常数量
     */
    private Integer abnormalQuantity;
    /**
     * 盘点人
     */
    private String username;
    /**
     * 备注信息
     */
    private String remark;
    /**
     * 盘点提交时间
     */
    private Long createTime;
    /**
     * 盘点商户名称
     */
    private String orgName;
    /**
     * 盘点商户id
     */
    private Integer orgId;
    /**
     *
     */
    private List<TakeStockCommodityDetailPayload> records;
}