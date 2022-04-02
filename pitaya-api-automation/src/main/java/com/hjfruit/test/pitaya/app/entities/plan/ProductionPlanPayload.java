package com.hjfruit.test.pitaya.app.entities.plan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 生产计划实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionPlanPayload {
    /**
     * 计划id
     */
    private String planId;
    /**
     * 计划单号
     */
    private String planCode;
    /**
     * 计划状态
     */
    private Integer planStatus;
    /**
     * 计划状态名称
     */
    private String planStatusName;
    /**
     * 出库单号
     */
    private String outOrderId;
    /**
     * 产品种类数量
     */
    private Integer categorySum;
    /**
     * 客户id
     */
    private Integer customerId;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 客户配送地址id
     */
    private Integer customerDistributionId;
    /**
     * 客户配送地址名称
     */
    private String customerDistributionName;
    /**
     * 仓库id
     */
    private String warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 分公司id
     */
    private Integer organizationId;
    /**
     * 分公司名称
     */
    private String organizationName;
    /**
     * 生产日期
     */
    private Long planDate;
    /**
     * 计划开始时间
     */
    private Long planStartTime;
    /**
     * 计划结束时间
     */
    private Long planEndTime;
    /**
     * 备注
     */
    private String planDescription;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人id
     */
    private Integer createBy;
    /**
     * 创建人名称
     */
    private String createUserName;
    /**
     * 更新时间
     */
    private Long updateTime;
    /**
     * 更新人id
     */
    private Integer updateBy;
    /**
     * 总期望数
     */
    private BigDecimal expectNumSum;
    /**
     * 总完成数
     */
    private BigDecimal completedNumSum;
    /**
     * 创建类型
     */
    private Integer createType;
    /**
     * 创建类型名称
     */
    private String createTypeName;
    /**
     * 销售变更提示,0 没有通知  10 通知未读  20 通知已处理  30 通知已忽略
     */
    private Integer saleChangeNotice;
    /**
     * 商品类型
     */
    private Integer commodityType;
}