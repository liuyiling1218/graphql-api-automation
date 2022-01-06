package com.hjfruit.test.operation.web.entities.production;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class SortingWarehouseInput {
    /**
     * 组织架构id
     */
    @Needed
    private Integer orgGroupId;
    /**
     * 组织id
     */
    @Needed
    private Integer orgId;
    /**
     * 分拣仓id,修改时传递
     */
    private Integer sortingWarehouseId;
    /**
     * 分拣仓名称
     */
    @Needed
    private String sortingWarehouseName;
    /**
     * 仓库名称
     */
    @Needed
    private String warehouseName;
    /**
     * 仓库地址
     */
    @Needed
    private String warehouseAddress;
    /**
     * 负责人id
     */
    @Needed
    private Integer userId;
}