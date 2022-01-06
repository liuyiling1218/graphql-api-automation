package com.hjfruit.test.pitaya.app.entities.v2.types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlowLog {
    /**
     *
     */
    private Integer type;
    /**
     *
     */
    private String note;
    /**
     *
     */
    private Long createTime;
    /**
     *
     */
    private Integer createBy;
    /**
     *
     */
    private Long flowId;
}