package com.hjfruit.test.pitaya.entities.secondment;

import lombok.Data;

import java.util.List;
/**
 * 
 */
@Data
public class SecondmentQueryPayload{
    /**
     * 
     */
    private Integer pageCurrent;
    /**
     * 
     */
    private Integer pageSize;
    /**
     * 
     */
    private Long totalRecords;
    /**
     * 
     */
    private List<SecondmentPayload> records;
}