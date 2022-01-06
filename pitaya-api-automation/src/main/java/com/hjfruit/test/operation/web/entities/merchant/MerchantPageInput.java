package com.hjfruit.test.operation.web.entities.merchant;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 获取商户列表入参
 */
@Data
public class MerchantPageInput {
    /**
     *
     */
    @Needed
    private Integer pageCurrent;
    /**
     *
     */
    @Needed
    private Integer pageSize;
    /**
     * 商户名称
     */
    private String name;
    /**
     * 登陆手机号
     */
    private String phone;
    /**
     * 负责人名称
     */
    private String userName;
}