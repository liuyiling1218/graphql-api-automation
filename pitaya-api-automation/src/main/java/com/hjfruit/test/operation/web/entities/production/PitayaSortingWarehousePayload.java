package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

/**
 *
 */
@Data
public class PitayaSortingWarehousePayload {
    /**
     * 分拣仓id
     */
    private Integer sortingWarehouseId;
    /**
     * 分拣仓名称
     */
    private String sortingWarehouseName;
    /**
     * 负责人id
     */
    private Integer userId;
    /**
     * 负责人姓名
     */
    private String userName;
    /**
     * 登录手机号
     */
    private String phone;
    /**
     * 所属组织架构名称
     */
    private String orgGroupName;
    /**
     * 所属组织架构id
     */
    private Integer orgGroupId;
    /**
     * 所属组织id
     */
    private Integer orgId;
    /**
     * 所属组织名称
     */
    private String orgName;
}