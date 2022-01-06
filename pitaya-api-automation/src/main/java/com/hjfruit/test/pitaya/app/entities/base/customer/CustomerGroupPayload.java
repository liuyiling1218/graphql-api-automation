package com.hjfruit.test.pitaya.app.entities.base.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 客户分组实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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