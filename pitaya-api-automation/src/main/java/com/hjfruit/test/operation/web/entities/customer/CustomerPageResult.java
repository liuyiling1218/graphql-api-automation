package com.hjfruit.test.operation.web.entities.customer;

import lombok.Data;

import java.util.List;

/**
 * 客户分页实体
 */
@Data
public class CustomerPageResult {
    /**
     *
     */
    private List<CustomerVO> records;
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