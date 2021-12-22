package com.hjfruit.test.pitaya.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class SubsidiaryPagePayload {
    /**
     *
     */
    private List<SubsidiaryPayload> records;
    /**
     *
     */
    private Integer pageCurrent;
    /**
     *
     */
    private Long totalRecords;
    /**
     *
     */
    private Integer pageSize;
}