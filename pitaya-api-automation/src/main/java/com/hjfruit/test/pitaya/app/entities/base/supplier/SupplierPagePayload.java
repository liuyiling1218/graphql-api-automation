package com.hjfruit.test.pitaya.app.entities.base.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 客户分页实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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