package com.hjfruit.test.pitaya.entities.check;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CheckRecordPageResultPayload {
    /**
     *
     */
    private List<CheckRecordPayload> records;
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