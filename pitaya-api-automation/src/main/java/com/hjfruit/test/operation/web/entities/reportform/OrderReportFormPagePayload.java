package com.hjfruit.test.operation.web.entities.reportform;

import lombok.Data;

import java.util.List;

/**
 * 列表分页对象
 */
@Data
public class OrderReportFormPagePayload {
    /**
     *
     */
    private List<OrderReportFormListPayload> records;
    /**
     *
     */
    private Integer pageCurrent;
    /**
     *
     */
    private Integer pageSize;
    /**
     *
     */
    private Long totalRecords;
}