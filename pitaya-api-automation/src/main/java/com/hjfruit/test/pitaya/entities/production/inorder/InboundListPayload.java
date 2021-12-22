package com.hjfruit.test.pitaya.entities.production.inorder;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class InboundListPayload {
    /**
     *
     */
    private String inApplyCode;
    /**
     *
     */
    private List<ToBeInboundPayload> toBeInBoundList;
    /**
     *
     */
    private List<InboundRecordPayload> inboundRecordList;
    /**
     * 商品类型Id
     */
    private Integer commodityTypeId;
}