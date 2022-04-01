package com.hjfruit.test.operation.web.entities.reportform;

import lombok.Data;

/**
 * 列表通用查询入参
 */
@Data
public class OutBoundReportFormQueryInput {
    /**
     * 商户ID
     */
    private Long merchantId;
    /**
     * 出库单号
     */
    private String outBoundNum;
    /**
     * 批次号
     */
    private String batchCode;
    /**
     * 商品
     */
    private String product;
    /**
     * 出库类型
     */
    private OutBoundType outBoundType;
    /**
     * 出库时间起
     */
    private Long outBoundStartTime;
    /**
     * 出库时间终
     */
    private Long outBoundEndTime;
}