package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class OutboundList {
    /**
     *
     */
    private List<ToBeOutbount> toBeOutBoundList;
    /**
     *
     */
    private List<OutboundRecord> outboundRecordList;
}