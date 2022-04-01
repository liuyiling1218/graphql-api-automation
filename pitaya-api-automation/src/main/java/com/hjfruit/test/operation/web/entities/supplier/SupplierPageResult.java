package com.hjfruit.test.operation.web.entities.supplier;

import lombok.Data;

import java.util.List;

/**
 * 客户分页实体
 */
@Data
public class SupplierPageResult {
    /**
     *
     */
    private List<SupplierResponse> records;
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