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
public class SecondmentPayload {
    /**
     * 借调id
     */
    private String secondmentId;
    /**
     * 订单号
     */
    private String secondmentCode;
    /**
     * 借调订单状态(10:待提交|20:已提交|30:已驳回|40:已完成|50:已取消|60:待审核)
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
     * 操作人员
     */
    private String operateName;
    /**
     * 操作时间
     */
    private Long operateDate;
    /**
     *
     */
    private String description;
    /**
     * 备注
     */
    private String remark;
    /**
     *
     */
    private List<SecondmentItemPayload> secondmentOrderItemList;
}