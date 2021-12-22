package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 生产任务明细
 */
@Data
public class TaskItem {
    /**
     * 生产任务明细id
     */
    private String taskItemId;
    /**
     * 生产计划id
     */
    private String planId;
    /**
     * 生产任务id
     */
    private String taskId;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * bom id
     */
    private Integer commodityBomId;
    /**
     * 商品sku id
     */
    private Integer commoditySkuId;
    /**
     * 商品规格选项id
     */
    private List<Integer> commoditySpecOptionId;
    /**
     * sku文字描述，规格选项文字数组
     */
    private List<String> skuTextDescription;
    /**
     * 期望数量
     */
    private BigDecimal expectNum;
    /**
     * 已生产数量，默认0
     */
    private BigDecimal completedNum;
    /**
     * 单位数量
     */
    private BigDecimal unitQuantity;
    /**
     * 单位类型
     */
    private Integer unitType;
    /**
     * 单位类型名称
     */
    private String unitTypeName;
    /**
     * 总计类型
     */
    private Integer totalType;
    /**
     * 总计类型名称
     */
    private String totalTypeName;
    /**
     * 变更通知,0 没有通知  10 通知未读  20 通知已处理  30 通知已忽略
     */
    private Integer planChangeNotice;
    /**
     * 变更数量
     */
    private BigDecimal changeQuantity;
    /**
     * 变更类型
     */
    private Integer changeType;
    /**
     * 规格要求
     */
    private String specificationLabel;
    /**
     * 包装要求
     */
    private String packageLabel;
    /**
     * 品质要求
     */
    private String quantityLabel;
}