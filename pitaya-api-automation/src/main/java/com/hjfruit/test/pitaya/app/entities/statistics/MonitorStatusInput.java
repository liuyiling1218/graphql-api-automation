package com.hjfruit.test.pitaya.app.entities.statistics;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonitorStatusInput {
    /**
     * 生产时间
     */
    @Needed
    private Long productionDate;
    /**
     * 生产类型
     */
    private Integer createType;
    /**
     * 客户类型
     */
    private Integer customerType;
    /**
     * 客户Id
     */
    private Integer customerId;
}