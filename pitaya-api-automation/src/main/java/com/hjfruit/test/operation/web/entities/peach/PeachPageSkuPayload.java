package com.hjfruit.test.operation.web.entities.peach;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PeachPageSkuPayload {
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
    private List<PeachListSku> records;
}