package com.hjfruit.test.operation.web.entities.reportform;

import lombok.Data;

import java.util.List;

/**
 * 列表分页对象
 */
@Data
public class OutBoundReportFormPagePayload {
    /**
     *
     */
    private List<OutBoundReportFormListPayload> records;
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