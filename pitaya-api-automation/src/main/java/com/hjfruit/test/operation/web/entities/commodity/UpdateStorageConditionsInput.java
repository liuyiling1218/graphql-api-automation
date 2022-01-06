package com.hjfruit.test.operation.web.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 更新商品存储管理条件graphql请求体
 */
@Data
public class UpdateStorageConditionsInput {
    /**
     * 商品id
     */
    @Needed
    private Integer categoryId;
    /**
     * 商品名称
     */
    private String categoryName;
    /**
     * 最低温度值（只能包含一位小数的数字）
     */
    @Needed
    private String minTemperature;
    /**
     * 最高温度值（只能包含一位小数的数字）
     */
    @Needed
    private String maxTemperature;
    /**
     * 最低湿度值（只能为正整数）
     */
    @Needed
    private String minHumidity;
    /**
     * 最大湿度值（只能为正整数）
     */
    @Needed
    private String maxHumidity;
    /**
     * 最小存放天数（只能为正整数）
     */
    @Needed
    private String minStorageDay;
    /**
     * 最大存放天数（只能为正整数）
     */
    @Needed
    private String maxStorageDay;
}