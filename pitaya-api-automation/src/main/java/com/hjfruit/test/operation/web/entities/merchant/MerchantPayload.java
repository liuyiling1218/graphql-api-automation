package com.hjfruit.test.operation.web.entities.merchant;

import lombok.Data;

/**
 * 商户列表返回
 */
@Data
public class MerchantPayload {
    /**
     * 商户id
     */
    private Integer id;
    /**
     * 商户名称
     */
    private String name;
    /**
     * 负责人名称
     */
    private String userName;
    /**
     * 登陆手机号
     */
    private String phone;
    /**
     * 所属组织架构名称
     */
    private String orgGroupName;
    /**
     * 所属组织架构ID
     */
    private Integer orgGroupId;
    /**
     * 所属组织名称
     */
    private String orgName;
    /**
     * 所属组织ID
     */
    private Integer orgId;
    /**
     * 操作ID
     */
    private Integer userId;
}