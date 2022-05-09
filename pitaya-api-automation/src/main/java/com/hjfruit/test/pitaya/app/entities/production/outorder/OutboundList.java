package com.hjfruit.test.pitaya.app.entities.production.outorder;

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