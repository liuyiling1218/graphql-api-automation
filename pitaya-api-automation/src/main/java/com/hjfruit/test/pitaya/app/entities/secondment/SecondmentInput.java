package com.hjfruit.test.pitaya.app.entities.secondment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondmentInput {
    /**
     * 借调id
     */
    private String secondmentId;
    /**
     * 订单号
     */
    private String secondmentCode;
    /**
     * 借调订单状态
     */
    private Integer secondmentStatus;
    /**
     * 订单类型
     */
    private Integer orderType;
    /**
     * 商品类型
     */
    private Integer commodityTypeId;
    /**
     * 商品类型名称
     */
    private String commodityTypeName;
    /**
     * 调出客户类型
     */
    private Integer outBelongType;
    /**
     *
     */
    private Integer outBelongId;
    /**
     * 调出客户名称
     */
    private String outBelongName;
    /**
     * 调入客户类型
     */
    private Integer inBelongType;
    /**
     * 调入客户di
     */
    private Integer inBelongId;
    /**
     * 调入客户名称
     */
    private String inBelongName;
    /**
     * 仓库id
     */
    private String warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 备注
     */
    private String remark;
    /**
     *
     */
    private List<SecondmentItemInput> secondmentOrderItemList;
}