package com.hjfruit.test.pitaya.app.entities.secondment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondmentPageInput {
    /**
     * 商品类型id
     */
    private Integer commodityTypeId;
    /**
     * 借调单号
     */
    private String secondmentCode;
    /**
     * 订单状态
     */
    private Integer orderStatus;
    /**
     * 借调申请列表时间，以天为单位
     */
    private Long date;
}