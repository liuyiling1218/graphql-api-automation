package com.hjfruit.test.pitaya.app.entities.base.customer;

import com.hjfruit.test.pitaya.app.entities.base.user.UserStatus;
import com.hjfruit.test.pitaya.app.entities.common.Org;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 客户返回实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerPayload {
    /**
     * 客户ID
     */
    private Integer customerId;
    /**
     * 客户分组ID
     */
    private Integer customerGroupId;
    /**
     * 客户分组名称
     */
    private String customerGroupName;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     *
     */
    private String customerShortName;
    /**
     * 备注信息
     */
    private String remark;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 配送信息
     */
    private List<CustomerDistributionPayload> customerDistribution;
    /**
     *
     */
    private CustomerType type;
    /**
     *
     */
    private CustomerAttribute attribute;
    /**
     *
     */
    private String phone;
    /**
     *
     */
    private String idNumber;
    /**
     *
     */
    private Org belongOrganization;
    /**
     *
     */
    private Integer customerUserId;
    /**
     *
     */
    private UserStatus userStatus;
}