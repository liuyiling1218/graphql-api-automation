package com.hjfruit.test.pitaya.app.entities.base.customer;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDistributionInput {
    /**
     * 配送ID
     */
    private Integer distributionId;
    /**
     * 客户ID
     */
    private Integer customerId;
    /**
     * 配送名称
     */
    private String distributionName;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 联系电话
     */
    private String phoneNum;
    /**
     *
     */
    @Needed
    private String provinceId;
    /**
     *
     */
    @Needed
    private String cityId;
    /**
     *
     */
    @Needed
    private String districtId;
    /**
     *
     */
    @Needed
    private String detailedAddress;
    /**
     *
     */
    private List<Float> coordinate;
}