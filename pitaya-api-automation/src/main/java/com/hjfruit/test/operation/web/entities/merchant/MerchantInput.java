package com.hjfruit.test.operation.web.entities.merchant;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 修改商户
 */
@Data
public class MerchantInput {
    /**
     * id
     */
    private Integer id;
    /**
     * 商户名称
     */
    private String name;
    /**
     * 组织架构ID
     */
    @Needed
    private Integer orgGroupId;
    /**
     * 组织ID
     */
    @Needed
    private Integer orgId;
    /**
     * 负责人ID
     */
    @Needed
    private Integer userId;
    /**
     * 负责人名称
     */
    private String userName;
    /**
     * 登陆手机号
     */
    private String phone;
}