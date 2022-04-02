package com.hjfruit.test.pitaya.app.entities.production.task;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 库存列表请求参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockCondition {
    /**
     * 任务id
     */
    @Needed
    private String taskId;
    /**
     * 商品类型 10原料，20辅料
     */
    @Needed
    private Integer commodityType;
}