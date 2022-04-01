package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PageVarietyGroupPayload {
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
    private List<VarietyGroup> records;
}