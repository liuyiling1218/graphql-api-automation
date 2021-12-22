package com.hjfruit.test.pitaya.entities.base.customer;

import lombok.Data;

import java.util.List;

/**
 * 客户分组实体
 */
@Data
public class CustomerGroupPayload {
    /**
     *
     */
    private Integer customerGroupId;
    /**
     *
     */
    private String customerGroupName;
    /**
     *
     */
    private List<CustomerPayload> customerPayloadList;
}