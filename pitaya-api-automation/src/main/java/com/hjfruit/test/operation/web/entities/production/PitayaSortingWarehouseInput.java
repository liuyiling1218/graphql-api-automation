package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

/**
 *
 */
@Data
public class PitayaSortingWarehouseInput {
    /**
     * 分拣仓名称
     */
    private String sortingWarehouseName;
    /**
     * 负责人姓名
     */
    private String principalName;
    /**
     * 登录手机号
     */
    private String phone;
}