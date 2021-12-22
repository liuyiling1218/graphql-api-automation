package com.hjfruit.test.pitaya.entities.label;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class ListQuickLabelPayload {
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
    /**
     *
     */
    private List<QuickLabelPayload> records;
}