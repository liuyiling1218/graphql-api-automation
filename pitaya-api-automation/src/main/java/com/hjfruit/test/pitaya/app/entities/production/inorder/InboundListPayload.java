package com.hjfruit.test.pitaya.app.entities.production.inorder;

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