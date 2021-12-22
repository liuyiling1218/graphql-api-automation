package com.hjfruit.test.pitaya.entities.base.customer;

import lombok.Data;

import java.util.List;

/**
 * 客户分页实体
 */
@Data
public class CustomerPagePayload {
    /**
     *
     */
    private List<CustomerPayload> records;
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