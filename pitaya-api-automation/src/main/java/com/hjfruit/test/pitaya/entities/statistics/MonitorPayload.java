package com.hjfruit.test.pitaya.entities.statistics;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
/**
 * 
 */
@Data
public class MonitorPayload{
    /**
     * 配送地址名称
     */
    private String customerName;
    /**
     * 仓库
     */
    private String customerDistributionName;
    /**
     * 状态
     */
    private Integer taskStatus;
    /**
     * 状态名称
     */
    private String taskStatusName;
    /**
     * 生产类型
     */
    private Integer createType;
    /**
     * 生产类型名称
     */
    private String createTypeName;
    /**
     * 
     */
    private String productionCommodity;
    /**
     * 已生产数控
     */
    private BigDecimal completedNum;
    /**
     * 计划生产数量
     */
    private BigDecimal expectNum;
    /**
     * 组长
     */
    private String leaderName;
    /**
     * 生产线
     */
    private Integer line;
    /**
     * 用时
     */
    private Long workTime;
    /**
     * 任务id
     */
    private String taskId;
    /**
     * 正式工人数
     */
    private Integer numberActual;
    /**
     * 临时工人数
     */
    private Integer tempWorkerQuantity;
    /**
     * 商品数量
     */
    private Integer commodityNum;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 负责人
     */
    private String createUserName;
    /**
     * 
     */
    private List<ProductionCommodityPayload> productionCommodityPayload;
}