package com.hjfruit.test.pitaya.app.entities.production.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 生产任务列表商品信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskItems {
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * sku选项
     */
    private List<String> skuTextDescription;
    /**
     * 总计类型名称
     */
    private String totalTypeName;
    /**
     * 期望数量
     */
    private BigDecimal expectNum;
    /**
     * 变更标识,0 没有通知  10 通知未读  20 通知已处理  30 通知已忽略
     */
    private Integer planChangeNotice;
}