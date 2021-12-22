package com.hjfruit.test.pitaya.entities.base.supplier;

import lombok.Data;

import java.util.List;

/**
 * 客户分页实体
 */
@Data
public class SupplierPagePayload {
    /**
     *
     */
    private List<SupplierPayload> records;
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