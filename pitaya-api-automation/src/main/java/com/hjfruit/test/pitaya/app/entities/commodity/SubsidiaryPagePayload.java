package com.hjfruit.test.pitaya.app.entities.commodity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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