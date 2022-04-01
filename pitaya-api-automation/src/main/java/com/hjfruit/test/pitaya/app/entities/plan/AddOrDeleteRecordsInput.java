package com.hjfruit.test.pitaya.app.entities.plan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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