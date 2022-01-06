package com.hjfruit.test.operation.web.entities.customer;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PageCustomerPayload {
    /**
     *
     */
    private List<PageCustomer> records;
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