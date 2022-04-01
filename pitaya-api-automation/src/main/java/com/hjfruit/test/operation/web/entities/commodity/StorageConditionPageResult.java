package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 * 查询商品存储管理条件【分页】返回结果
 */
@Data
public class StorageConditionPageResult {
    /**
     * 当前页码
     */
    private Integer pageCurrent;
    /**
     * 一页展示条数
     */
    private Integer pageSize;
    /**
     * 总条数
     */
    private Long totalRecords;
    /**
     * 返回商品存储管理条件数据集
     */
    private List<StorageCondition> records;
}