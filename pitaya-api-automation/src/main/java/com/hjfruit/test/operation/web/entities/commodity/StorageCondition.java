package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

/**
 * 商品存储管理条件基础信息
 */
@Data
public class StorageCondition {
    /**
     * 商品id
     */
    private Integer categoryId;
    /**
     * 商品名称
     */
    private String categoryName;
    /**
     * 最低温度值
     */
    private String minTemperature;
    /**
     * 最高温度值
     */
    private String maxTemperature;
    /**
     * 最低湿度值
     */
    private String minHumidity;
    /**
     * 最大湿度值
     */
    private String maxHumidity;
    /**
     * 最小存放天数
     */
    private String minStorageDay;
    /**
     * 最大存放天数
     */
    private String maxStorageDay;
    /**
     * 更新时间
     */
    private Long updatedTime;
    /**
     * 更新人（id）
     */
    private Integer updatedBy;
}