package com.hjfruit.test.operation.web.entities.label;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class LabelPagePayload {
    /**
     *
     */
    private List<ListLabels> records;
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