package com.hjfruit.test.operation.web.entities.reportform;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Data
public class AllocateCostDetailPayload {
    /**
     * id
     */
    private Integer id;
    /**
     * 调拨运杂费单号
     */
    private String costCode;
    /**
     * 提交时间
     */
    private Long outboundTime;
    /**
     * 调入组织
     */
    private String orgInName;
    /**
     * 调出组织
     */
    private String orgOutName;
    /**
     * 运杂费合计
     */
    private BigDecimal costTotalAmount;
    /**
     * 调拨货款合计
     */
    private BigDecimal commodityTotalAmount;
    /**
     * 调拨成本
     */
    private BigDecimal allocatedTotalAmount;
    /**
     * 结算方式
     */
    private String payModeName;
    /**
     * 车牌
     */
    private String board;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 备注
     */
    private String remark;
    /**
     * 制单人 发起调拨人
     */
    private String operator;
    /**
     * 商品信息
     */
    private List<AllocateCostCommodityDetailPayload> commodityDetail;
}