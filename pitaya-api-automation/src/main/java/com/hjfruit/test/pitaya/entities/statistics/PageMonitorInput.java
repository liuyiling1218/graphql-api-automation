package com.hjfruit.test.pitaya.entities.statistics;

import lombok.Data;
/**
 * 
 */
@Data
public class PageMonitorInput{
    /**
     * 生产时间
     */
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
     * 客户id
     */
    private Integer customerId;
    /**
     * 任务状态 10待生产 20生产中 30已完成
     */
    private Integer productionStatus;
}