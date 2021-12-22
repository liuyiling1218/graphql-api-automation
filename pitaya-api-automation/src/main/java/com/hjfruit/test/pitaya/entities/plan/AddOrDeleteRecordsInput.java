package com.hjfruit.test.pitaya.entities.plan;

import lombok.Data;

/**
 *
 */
@Data
public class AddOrDeleteRecordsInput {
    /**
     *
     */
    private String planId;
    /**
     *
     */
    private String taskId;
    /**
     *
     */
    private String taskItemId;
}