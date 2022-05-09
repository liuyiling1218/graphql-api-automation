package com.hjfruit.test.pitaya.app.entities.base.customer;

import com.hjfruit.test.pitaya.app.entities.base.location.LocationPayload;
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
public class CustomerDistributionPayload {
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
    private String distributionAddr;
    /**
     *
     */
    private LocationPayload province;
    /**
     *
     */
    private LocationPayload city;
    /**
     *
     */
    private LocationPayload district;
    /**
     *
     */
    private String detailedAddress;
    /**
     *
     */
    private List<Float> coordinate;
}